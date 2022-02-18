/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;


/**
 *
 * @author gaurav
 */
public class Cars {
    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
    
    //Add New Car
    
    public Car addNewcar(){
        Car newCar = new Car();
        cars.add(newCar);
        return newCar;
    }
    
    
    //Search Car By Serial Number
    
    
    public Car searchCarBySerialNumber(int serialNo){
        
        for (Car c : cars){
            
//            System.out.println("Cars class: get SerialNo :" + c.getSerialNumber());
//            System.out.println("Cars class: SerialNo :" + serialNo);
            if (c.getSerialNumber() == (serialNo)){
                return c; 
            }         
        }
        return null;
    } 
    
    
    //Searching Cars By Brand/Make
    
    
    public List<Car> searchCarByManufacturer(String manufacturer){
        System.out.println("Search Car By Manufacturer");
        
    List<Car> car2 = new ArrayList<>();
    for (Car c: cars){
        System.out.println("Loop running");
        System.out.println("c,gm : " + c.getManufacturer());
        System.out.println("m : "+ manufacturer);
        if (c.getManufacturer().equals(manufacturer)){
            System.out.println("Cars.java | searchCarByManufacturer | c.getManufacturer()  | manufacturer" + c.getManufacturer() + manufacturer);
        car2.add(c);
        }      
    }
        
    return car2;
    
}
    
    //Searching Cars By ModelNumber
    
    /**
     *
     * @param modelNumber
     * @return
     */
    public ArrayList<Car> searchCarByModel(int modelNumber){
    ArrayList<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
        if (c.getModelNumber()== modelNumber){
        car2.add(c);
        }      
    }
    return car2;
    
}
    //Get All Cars
    
    public List<Car> getAllAvailableCars(){
    
    List<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
      //  System.out.println(String.valueOf(c.isAvailability()));
        if (c.isAvailability() == true){
        car2.add(c);
        }
    }
    return car2;
    }
    
    
    //Get All Available Cars
    
    public List<Car> getAllCars(){return cars;}
    
    
    
    //Get First Available Car
    
    public Car searchFirstAvailableCar(){
        
        for (Car c : cars){
            if (c.isAvailability() == true){
            return c;
        }           
        }
        return null;
    } 
    
    
    //Get All Available Cars
    
    public ArrayList<Car> getAvailableCars(){
    ArrayList<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
        if (c.isAvailability() == true){
        car2.add(c);
        }
    }
    return car2;
    
}
    
    
        
    //Get All Cars manufactured in given Year
    
    public ArrayList<Car> getCarsByManufactureYear(int manufactureYear){
    ArrayList<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
        if (c.getManufactureYear() == manufactureYear){
        car2.add(c);
        }
    }
    return car2;
    
}
    
        //Get All Cars available in given City
    
    public ArrayList<Car> getCarsByCity(String city){
    ArrayList<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
        if (c.getCity().equals(city)){
        car2.add(c);
        }
    }
    return car2;
    
}
    
    
    //Get All Cars with given number of seats
    
    public ArrayList<Car> getCarsBySeatsNumber(int minSeat , int maxSeat){
    ArrayList<Car> car2 = new ArrayList<Car>();
    for (Car c: cars){
        if (c.getSeatsNumber() >= minSeat && c.getSeatsNumber() <= maxSeat){
        car2.add(c);
        }
    }
    return car2;
    
}
    
    //List All Cars by Expired Maintainance Certificate
    
    public ArrayList<Car> getCarsByExpiredMaintainanceCertificate(){
    ArrayList<Car> car2 = new ArrayList<Car>();
    
    Date date = new Date();
    
    for (Car c: cars){
        if (c.getMaintainanceCertificateDate().compareTo(date) < 0){
        car2.add(c);
        }
    }
    return car2;
    
}
    
    
  //Last Fleet update time
    
   public Date getLastUpdateTime(){
        
    Date date = new Date(0, 0, 0 , 0, 0 ,0);
    
    for (Car c: cars){
    
        if (c.getLastUpdateOrCreate().compareTo(date)> 0){
        date = c.getLastUpdateOrCreate();
        }
    }
    return date;
    
} 
    // List All Car Manufacturers

    /**
     *
     * @return
     */
    
    public HashSet<String> getManufacturers(){    
    HashSet<String> hs = new HashSet<>();

    for (Car c: cars){
        {
        hs.add(c.getManufacturer());
        }

    }
    return hs;
    
}
    
}
