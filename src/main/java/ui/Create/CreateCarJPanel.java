/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Create;

import java.awt.image.BufferedImage;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Car;
import model.Cars;

/**
 *
 * @author gaurav
 */
public class CreateCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form fderg
     */
    
    
    private JPanel userProcessContainer;
    private Cars cars;
    private List<Car> cars1;
    private final JFileChooser choosePic;
    private BufferedImage image;
    
    public CreateCarJPanel(JPanel upc , Cars c) {
        
        choosePic = new JFileChooser();
        choosePic.setFileFilter(new FileNameExtensionFilter("jpeg Files", "jpeg"));
        
        cars = c;
        cars1 = c.getAllCars();
        initComponents();
        userProcessContainer = upc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        txtManufacturer = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtManufatctureYear = new javax.swing.JTextField();
        txtSeatsNumber = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtMaintainanceCertificateDate = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblManufactureYear = new javax.swing.JLabel();
        lblSeatsNumber = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblMaintainanceCertificateDate = new javax.swing.JLabel();
        lblSave = new javax.swing.JButton();
        lblCreateCar = new javax.swing.JLabel();
        txtCheckA = new javax.swing.JCheckBox();
        txtCheckNA = new javax.swing.JCheckBox();
        btnLoadCars = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtMessage = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        lblManufacturer.setText("Manufacturer :");

        lblModelNumber.setText("Model Number :");

        lblManufactureYear.setText("Manufacture Year :");

        lblSeatsNumber.setText("Seats Number :");

        lblSerialNo.setText("Serial No :");

        lblCity.setText("City :");

        lblAvailability.setText("Availability :");

        lblMaintainanceCertificateDate.setText("Maintainance Certificate Date :");

        lblSave.setText("Save");
        lblSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSaveActionPerformed(evt);
            }
        });

        lblCreateCar.setText("CREATE CAR");

        txtCheckA.setText("Available");

        txtCheckNA.setText("Not Available");

        btnLoadCars.setText("Load Cars");
        btnLoadCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCarsActionPerformed(evt);
            }
        });

        jButton1.setText("Search image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton1)
                        .addGap(83, 83, 83)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaintainanceCertificateDate)
                                    .addComponent(lblSerialNo)
                                    .addComponent(lblSeatsNumber)
                                    .addComponent(lblCity)
                                    .addComponent(lblAvailability)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblManufacturer)
                                    .addComponent(lblModelNumber)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblManufactureYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSave, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoadCars, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManufatctureYear, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSeatsNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSerialNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCheckA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheckNA)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblCreateCar)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManufacturer)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufatctureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManufactureYear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeatsNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerialNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(18, 18, 18)
                        .addComponent(lblAvailability))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCheckA)
                        .addComponent(txtCheckNA)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaintainanceCertificateDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSave)
                    .addComponent(btnLoadCars))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSaveActionPerformed
       
        try {
            
           /* 
            Properties carProp = new Properties();
            String propertyFileName = "config.properties";
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(propertyFileName);
            
            carProp.load(inputStream);
            */
            if(txtSerialNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Car Details!");
                    return;
            }
            for(Car car1: cars1){
                
                if(car1.getSerialNumber() == Integer.parseInt(txtSerialNo.getText())){
                JOptionPane.showMessageDialog(this, "This Car already exists");
                    return;
                }
            }
            
            int manufactureYear = 0;
            int seatsNumber = 0;
            int serialNumber =0;
            int modelNumber=0;
            String city = txtCity.getText();
            boolean availability;
            String manufacturer = txtManufacturer.getText();
            
            FileReader reader = new FileReader("./config.properties");
            Properties carProp = new Properties();
            carProp.load(reader);
            
            try{    
                seatsNumber = Integer.parseInt(txtSeatsNumber.getText());
                serialNumber = Integer.parseInt(txtSerialNo.getText());
                manufactureYear = Integer.parseInt(txtManufatctureYear.getText());
                modelNumber = Integer.parseInt(txtModelNumber.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Provide correct int value of SeatNumber, SerialNo, ManufactureYear and Model Number");
            }
            
            if (manufactureYear < 2019 || manufactureYear > 2021 || serialNumber < 5) {
                    JOptionPane.showMessageDialog(this, "Serial number should be greater than 3 digits And Manufacture year should be from 2019,2020,2021!!");
                    return;
                }
             if (modelNumber < 100 || modelNumber > 102) {
                    JOptionPane.showMessageDialog(this, "Model number should be 100, 101 or 102");
                    return;
                }
            
              if (seatsNumber < 1 || seatsNumber > 4) {
                    JOptionPane.showMessageDialog(this, "Seat number should be 1, 2, 3 or 4");
                    return;
                }
             
            if (!(city.equals("Boston") || city.equals("Erie") || city.equals("New York") || city.equals("New Jersey"))) {
                    JOptionPane.showMessageDialog(this, "Enter City as one of following: Boston, Erie, New York, New Jersey");
                    return;
                }
            
            if (!(manufacturer.equals("Toyota") || manufacturer.equals("GM") || manufacturer.equals("Audi") || manufacturer.equals("Jeep"))) {
                    JOptionPane.showMessageDialog(this, "Enter Manufacturer as one of following: Toyota, GM, Audi, Jeep");
                    return;
                }
            if (image == null) {
                    JOptionPane.showMessageDialog(this, "Choose Image");
                    return;
                }
            
            
            
 
            if((txtCheckA.getSelectedObjects() == null && txtCheckNA.getSelectedObjects() == null) ||
                    (txtCheckA.getSelectedObjects()!= null && txtCheckNA.getSelectedObjects()!= null)
                    ){
                JOptionPane.showMessageDialog(this, "Select one checkBox: Available/NonAvailable");
                    return;
            }
       //     System.out.println(txtCheckA.getSelectedObjects());
            availability = (txtCheckA.getSelectedObjects()!= null);
         //   System.out.println(availability);
            
            Date date;
                try{   
                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    formatter.setLenient(false);
                    String dateInString = txtMaintainanceCertificateDate.getText();
                    date = formatter.parse(dateInString);
                    String year = dateInString.split("/")[2];
                    if (year.length()!=4){
                    throw new Exception("Year should nbe 4 digit long");
                    }        
                    
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Provide correct value of Maintainance Certificate Date in dd/MM/yyyy format");
                return;
            }
            
            Car car = cars.addNewcar();
            
            Date dateNow = new Date();
            

            
            car.setMaintainanceCertificateDate(date);
            car.setCity(city);
            car.setAvailability(availability);
            car.setManufactureYear(manufactureYear);
            car.setManufacturer(manufacturer);
            car.setModelNumber(modelNumber);
            car.setSeatsNumber(seatsNumber);
            car.setSerialNumber(serialNumber);
            
            car.setEngineNo(carProp.getProperty("engineNo"));
            car.setOwnerEmailAddresses(carProp.getProperty("emailAddress"));
            car.setColor(carProp.getProperty("color"));
            car.setLicensePlates(Integer.parseInt(carProp.getProperty("licensePlates")));
            car.setOwnerAddress(carProp.getProperty("ownerAddress"));
            car.setOwnerDriverLicense((Integer.parseInt(carProp.getProperty("ownerDriverLicense"))));
            car.setOwnerName(carProp.getProperty("ownerName"));
            car.setOwnerSocialSecurityNumber((Integer.parseInt(carProp.getProperty("ownerSocialSecurityNumber"))));
            car.setOwnerTelephoneNumbers(Long.parseLong(carProp.getProperty("telephonenumber")));
            car.setWarrantyYear(Integer.parseInt(carProp.getProperty("warrantyyear")));
            car.setLastUpdateOrCreate(dateNow);
            car.setPhoto(image);
            JOptionPane.showMessageDialog(null, "Car added!", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblSaveActionPerformed

    private void btnLoadCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCarsActionPerformed
        try {
            boolean availability = true;            
            FileReader reader = null;
            try {
                reader = new FileReader("./config.properties");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            Properties carProp = new Properties();
            try {
                carProp.load(reader);
            } catch (IOException ex) {
                Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int i;
            for( i=1 ;i< 27; i++){
                boolean exists = false;
                for(Car car1: cars1){
                
                if(car1.getSerialNumber() == Integer.parseInt(carProp.getProperty("serialNumber"+String.valueOf(i)))){
                    JOptionPane.showMessageDialog(this, "This Car already exists with Serial No: "+ carProp.getProperty("serialNumber"+String.valueOf(i)));
                    exists = true;
                    continue;
                }
            }
                
            if (exists == true)    {continue;}
             BufferedImage image1 = null;
                
                try {
                    image1 = ImageIO.read(new File("./CarImage.jpeg"));
                } catch (IOException ex) {
                    Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
            Car car = cars.addNewcar();
            Date dateNow = new Date();
            
            Date date;
                
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            formatter.setLenient(false);
            String dateInString = carProp.getProperty("maintainanceCertificateDate"+String.valueOf(i));
            date = formatter.parse(dateInString);
            
            
            car.setMaintainanceCertificateDate(date);
            car.setCity(carProp.getProperty("city"+String.valueOf(i)));
            
            if("true".equals(carProp.getProperty("availability"+String.valueOf(i)))){car.setAvailability(true);}
            else
            {car.setAvailability(false);}
            car.setManufactureYear(Integer.parseInt(carProp.getProperty("manufactureYear"+String.valueOf(i))));
            car.setManufacturer(carProp.getProperty("manufacturer"+String.valueOf(i)));
            car.setModelNumber(Integer.parseInt(carProp.getProperty("modelNumber"+String.valueOf(i))));
            car.setSeatsNumber(Integer.parseInt(carProp.getProperty("seatsNumber"+String.valueOf(i))));
            car.setSerialNumber(Integer.parseInt(carProp.getProperty("serialNumber"+String.valueOf(i))));            
            car.setEngineNo(carProp.getProperty("engineNo"+String.valueOf(i)));
            car.setOwnerEmailAddresses(carProp.getProperty("ownerEmailAddresses"+String.valueOf(i)));
            car.setColor(carProp.getProperty("color"+String.valueOf(i)));
            car.setLicensePlates(Integer.parseInt(carProp.getProperty("licensePlates"+String.valueOf(i))));
            car.setOwnerAddress(carProp.getProperty("ownerAddress"));
            car.setOwnerDriverLicense((Integer.parseInt(carProp.getProperty("ownerDriverLicense"+String.valueOf(i)))));
            car.setOwnerName(carProp.getProperty("ownerName"+String.valueOf(i)));
            car.setOwnerSocialSecurityNumber((Integer.parseInt(carProp.getProperty("ownerSocialSecurityNumber"+String.valueOf(i)))));
            car.setOwnerTelephoneNumbers(Long.parseLong(carProp.getProperty("ownerTelephoneNumbers"+String.valueOf(i))));
            car.setWarrantyYear(Integer.parseInt(carProp.getProperty("warrantyYear"+String.valueOf(i))));
            car.setLastUpdateOrCreate(dateNow);
            car.setPhoto(image1);
            }
            JOptionPane.showMessageDialog(null, "Car Loaded!", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            
            
// TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadCarsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int openValue = choosePic.showOpenDialog(this);
        
        if (openValue == JFileChooser.APPROVE_OPTION){
            try{
                image = ImageIO.read(choosePic.getSelectedFile());
                txtMessage.setText("Image Chosen");
            }catch(IOException ioe){
                txtMessage.setText("Error Getting Image");
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Choose Photo!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadCars;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateCar;
    private javax.swing.JLabel lblMaintainanceCertificateDate;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JButton lblSave;
    private javax.swing.JLabel lblSeatsNumber;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JCheckBox txtCheckA;
    private javax.swing.JCheckBox txtCheckNA;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMaintainanceCertificateDate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufatctureYear;
    private javax.swing.JLabel txtMessage;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatsNumber;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
