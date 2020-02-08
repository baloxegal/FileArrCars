import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileStreamToArrayApp{

	public static Car[] cars;
		
    public static void main(String[] args){
    	
    	loadFileToArray("cars.txt");
    	printArrayData();
    	
    }  
    
    public static void loadFileToArray( String filename ) {
    	File file = new File(filename);
    	try {
			Scanner carData = new Scanner(file);
			int i = 0;
			while(carData.hasNext()){
				if(i != 0) {
					Car[] carsTmp = Arrays.copyOf(cars, cars.length);
					cars = Arrays.copyOfRange(carsTmp, 0, carsTmp.length + 1);
				}
				else {
					cars = new Car[i + 1];
				}
				cars[i] = new Car(carData.next(), carData.nextInt(), carData.nextInt(), carData.nextInt());
				i++;
			}
			carData.close();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File do not exist!");
		}
    }
      
    public static void printArrayData() {
    	int i = 1;
    	for(Car c : cars) {
    		String[]carTmp = c.toString().split(", ");
    		System.out.printf(">%2d. CAR: %-9s %s %-9s %9s\n", i++, carTmp[0], carTmp[1], carTmp[2], carTmp[3]);
    	}
    }
}

class Car{
    String model;
    Integer year;
    Integer km;
    Integer price;
    
    public Car(String model, Integer year, Integer km, Integer price) {
      	try {
      		setModel(model);
    		setYear(year);
    	    setKm(km);
    	    setPrice(price);
    	} catch(Exception e) {
    		System.out.println("ERROR! DATA IS OUT OF RANGE!\n");
    	}
    }
    
    public void setModel(String model) throws Exception {
    	if(model != null) {
    		this.model = model;
    	}
    	else {
    		throw new Exception();
    	}
    }
    public String getModel() {
    	return model;
    }
    public void setYear(Integer year) throws Exception {
    	if(year >= 1900 && year <= 2020) {
    		this.year = year;
    	}
    	else {
    		throw new Exception();
    	}
    }
    public Integer getYear() {
    	return year;
    }
    public void setKm(Integer km) throws Exception {
    	if(km >= 0 && km <= 1500000) {
    		this.km = km;
    	}
    	else {
    		throw new Exception();
    	}
    }
    public Integer getKm() {
    	return km;
    }
    public void setPrice(Integer price) throws Exception {
    	if(price > 0) {
    		this.price = price;
    	}
    	else {
    		throw new Exception();
    	}
    }
    public Integer getPrice() {
    	return price;
    }
    
    public String toString() {
    	return model + ", " + year + ", " + km + "km, " + price + "USD";
    }
}