/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gaurav
 */
public class Car {
    
private String manufacturer;
private int serialNumber;
private int modelNumber;
private String color;
private int manufactureYear;
private int seatsNumber;
private String engineNo;
private int licensePlates;
private String ownerName;
private long ownerTelephoneNumbers;
private int ownerDriverLicense;
private int ownerSocialSecurityNumber;
private String ownerEmailAddresses;
private String ownerAddress;
private int warrantyYear;
private Date lastUpdateOrCreate;
private boolean availability;
private String city;
private Date maintainanceCertificateDate;

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }


    

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getOwnerTelephoneNumbers() {
        return ownerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(long ownerTelephoneNumbers) {
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
    }

    public int getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(int licensePlates) {
        this.licensePlates = licensePlates;
    }

    public int getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(int ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public int getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(int ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }





    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }
/*   public Date getLastUpdateOrCreate() {
        return lastUpdateOrCreate;
    }

    public void setLastUpdateOrCreate(Date lastUpdateOrCreate) {
        this.lastUpdateOrCreate = lastUpdateOrCreate;
    } */

    public Date getLastUpdateOrCreate() {
        return lastUpdateOrCreate;
    }

    public void setLastUpdateOrCreate(Date lastUpdateOrCreate) {
        this.lastUpdateOrCreate = lastUpdateOrCreate;
    }

    public Date getMaintainanceCertificateDate() {
        return maintainanceCertificateDate;
    }

    public void setMaintainanceCertificateDate(Date maintainanceCertificateDate) {
        this.maintainanceCertificateDate = maintainanceCertificateDate;
    }

    
    
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean Availability) {
        this.availability = Availability;
    }

/*    public Date getMaintainanceCertificateDate() {
        return maintainanceCertificateDate;
    }

    public void setMaintainanceCertificateDate(Date maintainanceCertificateDate) {
        this.maintainanceCertificateDate = maintainanceCertificateDate;
    } */

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public void setOwnerEmailAddresses(String wnerEmailAddresses) {
        this.ownerEmailAddresses = wnerEmailAddresses;
    }
        

}
