/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.View;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.Cars;

/**
 *
 * @author gaurav
 */
public class FindFirstAvailableCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FindFirstAvailableCarJPanel
     */
    
    private JPanel userProcessContainer;
    private Car car1;
    private List<Car> cars1;
    public FindFirstAvailableCarJPanel(JPanel upc , Car c) {
   //     System.out.println("constructor");
        car1 = c;
        userProcessContainer = upc;
        initComponents();
        
        
                txtManufacturer.setText(car1.getManufacturer());
                txtColor.setText(car1.getColor());
                txtEngineNo.setText(String.valueOf(car1.getEngineNo()));
                txtLicensePlates.setText(String.valueOf(car1.getLicensePlates()));
                txtModelNumber.setText(String.valueOf(car1.getModelNumber()));
                txtOwnerAddress.setText(car1.getOwnerAddress());
                txtOwnerName.setText(car1.getOwnerName());
                txtOwnerDriverLicense.setText(String.valueOf(car1.getOwnerDriverLicense()));
                txtOwnerEmailAddresses.setText(car1.getOwnerEmailAddresses());
                txtOwnerSocialSecurityNumber.setText(String.valueOf(car1.getOwnerSocialSecurityNumber()));
                txtOwnerTelephoneNumbers.setText(String.valueOf(car1.getOwnerTelephoneNumbers()));
   //           BufferedImage image;
   //            try {
   //                image = ImageIO.read(new File("./"+car1.getPhoto()));
   //               ImageIcon ic = new ImageIcon(image.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
   //                
   //                carPhoto.setIcon(ic);
                   
   //            } catch (IOException ex) {
   //                 JOptionPane.showMessageDialog(this, "Not a valid image to show!!");
   //           }
                txtSeatsNumber.setText(String.valueOf(car1.getSeatsNumber()));
                txtWarrantyYear.setText(String.valueOf(car1.getWarrantyYear()));
                
                String maintainanceDate = car1.getMaintainanceCertificateDate().toString().substring(4,10) 
                        + "," + car1.getMaintainanceCertificateDate().toString().substring(24);                
                txtMaintainanceCertificateDate.setText(maintainanceDate);
                txtCity.setText(car1.getCity());               
                if (car1.isAvailability() == true)
                {
                    txtAvailability.setText("Available");
                }else{
                    txtAvailability.setText("Not Available");
                }
                txtManufactureYear.setText(String.valueOf(car1.getManufactureYear()));
                txtSerialNumber.setText(String.valueOf(car1.getSerialNumber()));
                String updateOrCreateDate = car1.getLastUpdateOrCreate().toString().substring(4,10) 
                        + "," + car1.getLastUpdateOrCreate().toString().substring(24);
                txtLastUpdateOrCreate.setText(updateOrCreateDate);
        
                ImageIcon ic = new ImageIcon(car1.getPhoto().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                lblPic.setIcon(ic);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        lblModelNumber = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        lblWarrantyYear = new javax.swing.JLabel();
        lblOwnerAddress = new javax.swing.JLabel();
        txtOwnerAddress = new javax.swing.JTextField();
        txtOwnerSocialSecurityNumber = new javax.swing.JTextField();
        lblOwnerSocialSecurityNumber = new javax.swing.JLabel();
        lblOwnerDriverLicense = new javax.swing.JLabel();
        txtOwnerDriverLicense = new javax.swing.JTextField();
        lblOwnerEmailAddresses = new javax.swing.JLabel();
        txtOwnerEmailAddresses = new javax.swing.JTextField();
        txtOwnerTelephoneNumbers = new javax.swing.JTextField();
        lblOwnerTelephoneNumbers = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        txtLicensePlates = new javax.swing.JTextField();
        lblLicensePlates = new javax.swing.JLabel();
        txtSeatsNumber = new javax.swing.JTextField();
        lblSeatsNumber = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        txtEngineNo = new javax.swing.JTextField();
        lblManufactureYear = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        lbllastUpdateOrCreate = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblMaintainanceCertificateDate = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        txtLastUpdateOrCreate = new javax.swing.JTextField();
        txtAvailability = new javax.swing.JTextField();
        txtMaintainanceCertificateDate = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();

        jLabel1.setText("First Available car");

        lblManufacturer.setText("Manufacturer :");

        lblModelNumber.setText("Model Number :");

        lblColor.setText("Color :");

        lblPhoto.setText("Photo :");

        lblWarrantyYear.setText("Warranty Year :");

        lblOwnerAddress.setText("Owner Address :");

        lblOwnerSocialSecurityNumber.setText("Owner Social Security Number :");

        lblOwnerDriverLicense.setText("Owner Driver License :");

        lblOwnerEmailAddresses.setText("Owner Email Addresses :");

        lblOwnerTelephoneNumbers.setText("Owner Telephone Numbers :");

        lblOwnerName.setText("Owner Name :");

        lblLicensePlates.setText("License Plates :");

        lblSeatsNumber.setText("Seats Number :");

        lblEngineNo.setText("Engine No. :");

        lblManufactureYear.setText("Manufacture Year :");

        lblSerialNumber.setText("Serial Number :");

        lbllastUpdateOrCreate.setText("Last Update Or Create :");

        lblAvailability.setText("Availability :");

        lblMaintainanceCertificateDate.setText("Maintainance Certificate Date :");

        lblCity.setText("City :");

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPic.setText("Photo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSerialNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAvailability)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllastUpdateOrCreate)
                                    .addComponent(lblMaintainanceCertificateDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastUpdateOrCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEngineNo)
                                            .addComponent(lblManufacturer)
                                            .addComponent(lblModelNumber)
                                            .addComponent(lblOwnerSocialSecurityNumber)
                                            .addComponent(lblOwnerDriverLicense)
                                            .addComponent(lblOwnerEmailAddresses)
                                            .addComponent(lblOwnerTelephoneNumbers)
                                            .addComponent(lblOwnerName)
                                            .addComponent(lblSeatsNumber)
                                            .addComponent(lblColor)
                                            .addComponent(lblWarrantyYear)
                                            .addComponent(lblManufactureYear)
                                            .addComponent(lblOwnerAddress))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblLicensePlates)
                                            .addGap(103, 103, 103)))
                                    .addComponent(lblCity)
                                    .addComponent(lblPhoto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtManufactureYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEngineNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSeatsNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtOwnerTelephoneNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOwnerSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOwnerEmailAddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOwnerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufacturer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufactureYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEngineNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatsNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerName)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerTelephoneNumbers)
                    .addComponent(txtOwnerTelephoneNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerEmailAddresses)
                    .addComponent(txtOwnerEmailAddresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerDriverLicense)
                    .addComponent(txtOwnerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerSocialSecurityNumber)
                    .addComponent(txtOwnerSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerAddress)
                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarrantyYear)
                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicensePlates)
                    .addComponent(txtLicensePlates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllastUpdateOrCreate)
                    .addComponent(txtLastUpdateOrCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblLicensePlates;
    private javax.swing.JLabel lblMaintainanceCertificateDate;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerDriverLicense;
    private javax.swing.JLabel lblOwnerEmailAddresses;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSocialSecurityNumber;
    private javax.swing.JLabel lblOwnerTelephoneNumbers;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblSeatsNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lbllastUpdateOrCreate;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLastUpdateOrCreate;
    private javax.swing.JTextField txtLicensePlates;
    private javax.swing.JTextField txtMaintainanceCertificateDate;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerDriverLicense;
    private javax.swing.JTextField txtOwnerEmailAddresses;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerSocialSecurityNumber;
    private javax.swing.JTextField txtOwnerTelephoneNumbers;
    private javax.swing.JTextField txtSeatsNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtWarrantyYear;
    // End of variables declaration//GEN-END:variables
}
