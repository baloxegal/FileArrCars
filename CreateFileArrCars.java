import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileArrCars {
 
	public static void main(String[] args) {
    	
    	String carModel_1 = "BMW";
    	String carModel_2 = "BMW";
    	String carModel_3 = "Mercedes";
    	
    	Integer carYear_1 = 1999;
    	Integer carYear_2 = 2011;
    	Integer carYear_3 = 2002;
    	
    	Integer carMileage_1 = 1000000;
    	Integer carMileage_2 = 10000;
    	Integer carMileage_3 = 20000;
    	
    	Integer carPrice_1 = 1000;
    	Integer carPrice_2 = 20000;
    	Integer carPrice_3 = 10000;
				
		File fileCars = new File("cars.txt");
    	
//    	try {
//			fileCars.createNewFile();
//			System.out.println("File created");
//		} catch (IOException e) {
//			//e.printStackTrace();
//			System.out.println("No file created");
//		}
//    	System.out.println(fileCars.exists());
//    	System.out.println(fileCars.getName());
//    	System.out.println(fileCars.getPath());
//    	System.out.println(fileCars.getAbsolutePath());
    	
    	try {
			FileWriter writeArrCars = new FileWriter(fileCars, true);
			
			System.out.println("File created");
			System.out.println(fileCars.exists());
			System.out.println(fileCars.getName());
			System.out.println(fileCars.getAbsolutePath());
			
			writeArrCars.write(carModel_1 + " " + carYear_1 + " " + carMileage_1 + " " + carPrice_1 + "\n" +
							   carModel_2 + " " + carYear_2 + " " + carMileage_2 + " " + carPrice_2 + "\n" +
							   carModel_3 + " " + carYear_3 + " " + carMileage_3 + " " + carPrice_3);
			writeArrCars.close();
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Failed to write to file or file does not exist");
		}
    }
}