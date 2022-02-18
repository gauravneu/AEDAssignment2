/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Update;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.Cars;

/**
 *
 * @author gaurav
 */
public class UpdateCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCarJPanel
     */
    private JPanel userProcessContainer;
    private Cars cars;
    private List<Car> cars1;
    
    public UpdateCarJPanel(JPanel upc , Cars c) {
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

        lblUpdateCar = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        lblUpdateCar.setText("UPDATE CAR");

        lblSerialNumber.setText("Serial Number :");

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        btnSearch.setText("Update Car");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblSerialNumber)
                        .addGap(134, 134, 134)
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(lblUpdateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(btnSearch)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblUpdateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSearch)
                .addContainerGap(436, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        try{
        Car c;
        
        int SerialNo = Integer.parseInt(txtSerialNumber.getText());
        c = cars.searchCarBySerialNumber(SerialNo);
        
        if(c!=null){
        UpdatingCarJPanel vpdjp = new UpdatingCarJPanel(userProcessContainer, c);
        userProcessContainer.add("UpdatingCarJPanel", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nothing found", "No result found matching your criteria!!", JOptionPane.WARNING_MESSAGE);
            //return;
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Nothing found", "No result found matching your criteria!!", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblUpdateCar;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}