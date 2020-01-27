
public class FileStreamToArrayApp{

    public static Car[] cars = new Car [] {
    	
    };

    public static void main(String[] args){
      
    }  
    /**
        метод который читает из файла
        он получает @param filename - путь до файла что нужно открыть
        суть метода:
        1) открыть файл через Scanner() + File()
        2) путем цикла while() + Scanner.hasNext() сделайте так
           чтобы метод загрузил в массив "cars" все данные
         
     */
    public static void loadFileToArray( String filename ) {

    }
    /**
        метод который выводит список данных из массива "cars"
        суть метода:
        1) цикл for (each) по массиву "cars"
        2) используя Car.toString() преобразует результат
           на экране в такой формат
           > 1. CAR: BMW 1999 1000000km  1000USD
           > 2. CAR: BMW 2011 10000km   20000USD
           > 3. ....
     */
    public static void printArrayData() {

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
    	if(model == null) {
    		throw new Exception();
    	}
    	else {
    		this.model = model;
    	}
    }
    public String getModel() {
    	return model;
    }
    public void setYear(Integer year) throws Exception {
    	if(year < 1900) {
    		throw new Exception();
    	}
    	else {
    		this.year = year;
    	}
    }
    public Integer getYear() {
    	return year;
    }
    public void setKm(Integer km) throws Exception {
    	if(km < 0) {
    		throw new Exception();
    	}
    	else {
    		this.km = km;
    	}
    }
    public Integer getKm() {
    	return km;
    }
    public void setPrice(Integer price) throws Exception {
    	if(price < 0) {
    		throw new Exception();
    	}
    	else {
    		this.price = price;
    	}
    }
    public Integer getPrice() {
    	return price;
    }
    
    public String toString() {
    	String carString = model + " " + year + " " + km + " " + price;
    	return carString;
    }
}
