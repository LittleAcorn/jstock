/*
 * OptionsBrokerJPanel.java
 *
 * Created on April 10, 2008, 7:43 PM
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2008 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

import java.awt.Frame;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.text.NumberFormatter;
import org.yccheok.jstock.portfolio.BrokingFirm;

/**
 *
 * @author  yccheok
 */
public class OptionsBrokerJPanel extends javax.swing.JPanel implements JStockOptionsObserver {
    
    /** Creates new form OptionsBrokerJPanel */
    public OptionsBrokerJPanel() {
        initComponents();
    }
    
    private JFormattedTextField getCurrencyJFormattedTextField(double minimum) {
        NumberFormat format= NumberFormat.getNumberInstance();
        NumberFormatter formatter= new NumberFormatter(format);
        formatter.setMinimum(minimum);
        formatter.setValueClass(Double.class);
        JFormattedTextField field= new JFormattedTextField(formatter);
        return field;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jFormattedTextField1 = getCurrencyJFormattedTextField(0.0);
        jFormattedTextField2 = getCurrencyJFormattedTextField(0.0);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3 = getCurrencyJFormattedTextField(0.0);
        jPanel4 = new javax.swing.JPanel();
        jFormattedTextField4 = getCurrencyJFormattedTextField(0.0);
        jFormattedTextField5 = getCurrencyJFormattedTextField(0.0);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField6 = getCurrencyJFormattedTextField(0.0);
        jPanel5 = new javax.swing.JPanel();
        jFormattedTextField7 = getCurrencyJFormattedTextField(0.0);
        jFormattedTextField8 = getCurrencyJFormattedTextField(1.0);
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField9 = getCurrencyJFormattedTextField(0.0);

        setLayout(new java.awt.BorderLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        jXHeader1.setDescription(bundle.getString("OptionsBrokerJPanel_Description")); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/calc.png"))); // NOI18N
        jXHeader1.setTitle(bundle.getString("OptionsBrokerJPanel_BrokerFee")); // NOI18N
        add(jXHeader1, java.awt.BorderLayout.NORTH);

        jCheckBox1.setText(bundle.getString("OptionsBrokerJPanel_AutoCalculate")); // NOI18N
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsBrokerJPanel_BrokingFirm"))); // NOI18N

        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jButton1.setText(bundle.getString("OptionsBrokerJPanel_Add...")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(bundle.getString("OptionsBrokerJPanel_Delete")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(bundle.getString("OptionsBrokerJPanel_Edit...")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsBrokerJPanel_BrokerFee"))); // NOI18N

        jFormattedTextField1.setValue(new Double(0.0));

        jFormattedTextField2.setValue(new Double(0.0));

        jLabel2.setText(bundle.getString("OptionsBrokerJPanel_Rate%")); // NOI18N

        jLabel3.setText(bundle.getString("OptionsBrokerJPanel_MaximumFee")); // NOI18N

        jLabel4.setText(bundle.getString("OptionsBrokerJPanel_MinimumFee")); // NOI18N

        jFormattedTextField3.setValue(new Double(0.0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFormattedTextField1)
                    .addComponent(jFormattedTextField2)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsBrokerJPanel_ClearingFee"))); // NOI18N

        jFormattedTextField4.setValue(new Double(0.0));

        jFormattedTextField5.setValue(new Double(0.0));

        jLabel5.setText(bundle.getString("OptionsBrokerJPanel_Rate%")); // NOI18N

        jLabel6.setText(bundle.getString("OptionsBrokerJPanel_MaximumFee")); // NOI18N

        jLabel7.setText(bundle.getString("OptionsBrokerJPanel_MinimumFee")); // NOI18N

        jFormattedTextField6.setValue(new Double(0.0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField6)
                    .addComponent(jFormattedTextField5)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsBrokerJPanel_StampDuty"))); // NOI18N

        jFormattedTextField7.setValue(new Double(0.0));

        jFormattedTextField8.setValue(new Double(1.0));

        jLabel8.setText(bundle.getString("OptionsBrokerJPanel_Rate")); // NOI18N

        jLabel9.setText(bundle.getString("OptionsBrokerJPanel_Fraction")); // NOI18N

        jLabel10.setText(bundle.getString("OptionsBrokerJPanel_MaximumFee")); // NOI18N

        jFormattedTextField9.setValue(new Double(0.0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField9)
                    .addComponent(jFormattedTextField8)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, 0, 105, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OptionsJDialog optionsJDialog = (OptionsJDialog)javax.swing.SwingUtilities.getAncestorOfClass(OptionsJDialog.class, this);
        NewBrokingFirmJDialog newBrokingFirmJDialog = new NewBrokingFirmJDialog((Frame)optionsJDialog.getParent(), true);               
        newBrokingFirmJDialog.setVisible(true);  
        
        final BrokingFirm brokingFirm = newBrokingFirmJDialog.getBrokingFirm();
        
        if(brokingFirm != null) {
            this.brokingFirms.add(brokingFirm);
            final ListModel listModel = this.jList1.getModel();
            final DefaultListModel defaultListModel = (DefaultListModel)(listModel);
            defaultListModel.addElement(brokingFirm.getName());  
            this.jList1.setSelectedIndex(defaultListModel.size() - 1);
        }
        this.updateGUIState();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        this.updateGUIState();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void updateCurrentSelectedBrokingFirm() {
        if(OptionsBrokerJPanel.this.currentSelectedBrokingFirm != null) {
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setBrokerRate((Double)OptionsBrokerJPanel.this.jFormattedTextField1.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setBrokerMaximumRate((Double)OptionsBrokerJPanel.this.jFormattedTextField2.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setBrokerMinimumRate((Double)OptionsBrokerJPanel.this.jFormattedTextField3.getValue());

            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setClearingFeeRate((Double)OptionsBrokerJPanel.this.jFormattedTextField4.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setClearingFeeMaximumRate((Double)OptionsBrokerJPanel.this.jFormattedTextField5.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setClearingFeeMinimumRate((Double)OptionsBrokerJPanel.this.jFormattedTextField6.getValue());

            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setStampDutyRate((Double)OptionsBrokerJPanel.this.jFormattedTextField7.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setStampDutyFraction((Double)OptionsBrokerJPanel.this.jFormattedTextField8.getValue());
            OptionsBrokerJPanel.this.currentSelectedBrokingFirm.setStampDutyMaximumRate((Double)OptionsBrokerJPanel.this.jFormattedTextField9.getValue());
        }        
    }
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        final javax.swing.event.ListSelectionEvent e = evt;
        
        // We need to put all the update action inside GUI event dispatch queue.
        // If not, we will not able to get the latest updated value from
        // text field.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                updateCurrentSelectedBrokingFirm();
                
                JList me = (JList)e.getSource();
                final int index = me.getSelectedIndex();

                if(index < 0) {
                    OptionsBrokerJPanel.this.jFormattedTextField1.setValue(0.0);
                    OptionsBrokerJPanel.this.jFormattedTextField2.setValue(0.0);
                    OptionsBrokerJPanel.this.jFormattedTextField3.setValue(0.0);

                    OptionsBrokerJPanel.this.jFormattedTextField4.setValue(0.0);
                    OptionsBrokerJPanel.this.jFormattedTextField5.setValue(0.0);
                    OptionsBrokerJPanel.this.jFormattedTextField6.setValue(0.0);

                    OptionsBrokerJPanel.this.jFormattedTextField7.setValue(0.0);
                    OptionsBrokerJPanel.this.jFormattedTextField8.setValue(1.0);
                    OptionsBrokerJPanel.this.jFormattedTextField9.setValue(0.0);        

                    OptionsBrokerJPanel.this.setLogo(null);

                    OptionsBrokerJPanel.this.currentSelectedBrokingFirm = null;                

                    return;
                }

                final BrokingFirm brokingFirm = OptionsBrokerJPanel.this.brokingFirms.get(index);

                OptionsBrokerJPanel.this.jFormattedTextField1.setValue(brokingFirm.getBrokerRate());
                OptionsBrokerJPanel.this.jFormattedTextField2.setValue(brokingFirm.getBrokerMaximumRate());
                OptionsBrokerJPanel.this.jFormattedTextField3.setValue(brokingFirm.getBrokerMinimumRate());

                OptionsBrokerJPanel.this.jFormattedTextField4.setValue(brokingFirm.getClearingFeeRate());
                OptionsBrokerJPanel.this.jFormattedTextField5.setValue(brokingFirm.getClearingFeeMaximumRate());
                OptionsBrokerJPanel.this.jFormattedTextField6.setValue(brokingFirm.getClearingFeeMinimumRate());

                OptionsBrokerJPanel.this.jFormattedTextField7.setValue(brokingFirm.getStampDutyRate());
                OptionsBrokerJPanel.this.jFormattedTextField8.setValue(brokingFirm.getStampDutyFraction());
                OptionsBrokerJPanel.this.jFormattedTextField9.setValue(brokingFirm.getStampDutyMaximumRate());        

                OptionsBrokerJPanel.this.setLogo(brokingFirm.getLogo());
                
                OptionsBrokerJPanel.this.currentSelectedBrokingFirm = brokingFirm;                
            }
        });
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(this.currentSelectedBrokingFirm == null) return;
        
        OptionsJDialog optionsJDialog = (OptionsJDialog)javax.swing.SwingUtilities.getAncestorOfClass(OptionsJDialog.class, this);
        NewBrokingFirmJDialog newBrokingFirmJDialog = new NewBrokingFirmJDialog((Frame)optionsJDialog.getParent(), true);               
        newBrokingFirmJDialog.setBrokingFirm(this.currentSelectedBrokingFirm);
        newBrokingFirmJDialog.setVisible(true);  
        
        final BrokingFirm brokingFirm = newBrokingFirmJDialog.getBrokingFirm();
        
        if(brokingFirm != null) {
            final int index = this.jList1.getSelectedIndex();
            this.brokingFirms.remove(index);            
            this.brokingFirms.add(index, brokingFirm);
            final ListModel listModel = this.jList1.getModel();
            final DefaultListModel defaultListModel = (DefaultListModel)(listModel);
            defaultListModel.removeElementAt(index);
            defaultListModel.add(index, brokingFirm.getName());  
            this.jList1.setSelectedIndex(index);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        final int index = this.jList1.getSelectedIndex();
        if(index < 0) return;
        
        this.brokingFirms.remove(index);    
        final ListModel listModel = this.jList1.getModel();
        final DefaultListModel defaultListModel = (DefaultListModel)(listModel);
        defaultListModel.removeElementAt(index);
        
        if(index > 0) {
            this.jList1.setSelectedIndex(index - 1);
        }
        else {
            if(defaultListModel.getSize() > 0)
                this.jList1.setSelectedIndex(0);
            else
                this.jList1.clearSelection();
        }

        this.updateGUIState();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void updateGUIState() {
        final boolean state0 = jCheckBox1.isSelected();
        // Only allow selection when user had selected a broker firm.
        final boolean state1 = jCheckBox1.isSelected() && (jList1.getSelectedIndex() >= 0);

        jButton1.setEnabled(state0);
        jButton2.setEnabled(state0);
        jButton3.setEnabled(state0);
        jLabel1.setEnabled(state0);
        jList1.setEnabled(state0);
        jPanel2.setEnabled(state0);
        jPanel6.setEnabled(state0);

        jFormattedTextField1.setEnabled(state1);
        jFormattedTextField2.setEnabled(state1);
        jFormattedTextField3.setEnabled(state1);
        jFormattedTextField4.setEnabled(state1);
        jFormattedTextField5.setEnabled(state1);
        jFormattedTextField6.setEnabled(state1);
        jFormattedTextField7.setEnabled(state1);
        jFormattedTextField8.setEnabled(state1);
        jFormattedTextField9.setEnabled(state1);
        
        jLabel10.setEnabled(state1);
        jLabel2.setEnabled(state1);
        jLabel3.setEnabled(state1);
        jLabel4.setEnabled(state1);
        jLabel5.setEnabled(state1);
        jLabel6.setEnabled(state1);
        jLabel7.setEnabled(state1);
        jLabel8.setEnabled(state1);
        jLabel9.setEnabled(state1);
        jPanel3.setEnabled(state1);
        jPanel4.setEnabled(state1);
        jPanel5.setEnabled(state1);
        jPanel6.setEnabled(state1);
        jScrollPane1.setEnabled(state1);
    }
    
    private void setLogo(Image logo) {
        if(logo == null) {
            jLabel1.setIcon(null);
            return;
        }
        
        // We use 2, to allow some image gap from the boundary.        
        final ImageIcon scaledImageIcon = new ImageIcon(Utils.getScaledImage(logo, jLabel1.getWidth() - 2, jLabel1.getHeight() - 2));
        
        jLabel1.setIcon(scaledImageIcon);
    }
    
    public void set(JStockOptions jStockOptions) {
        final int size = jStockOptions.getBrokingFirmSize();
        
        final DefaultListModel defaultListModel = (DefaultListModel)(this.jList1.getModel());
        for(int i = 0; i < size; i++) {
            brokingFirms.add(new BrokingFirm(jStockOptions.getBrokingFirm(i)));
            defaultListModel.addElement(brokingFirms.get(i).getName());
        }
        
        this.jCheckBox1.setSelected(jStockOptions.isAutoBrokerFeeCalculationEnabled());
        
        if(jStockOptions.getSelectedBrokingFirmIndex() >= 0) {
            this.jList1.setSelectedIndex(jStockOptions.getSelectedBrokingFirmIndex());
        }

        this.updateGUIState();
    }

    public boolean apply(JStockOptions jStockOptions) {
        updateCurrentSelectedBrokingFirm();
        
        jStockOptions.clearBrokingFirms();
        
        for(BrokingFirm brokingFirm : brokingFirms) {
            jStockOptions.addBrokingFirm(brokingFirm);
        }
        
        jStockOptions.setAutoBrokerFeeCalculationEnabled(this.jCheckBox1.isSelected());
        
        jStockOptions.setSelectedBrokingFirmIndex(this.jList1.getSelectedIndex());
        
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables

    // For tmp storage, before user click on Apply.
    private List<BrokingFirm> brokingFirms = new ArrayList<BrokingFirm>();    
    private BrokingFirm currentSelectedBrokingFirm = null;
}
