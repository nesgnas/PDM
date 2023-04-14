package org.example.frame;

import org.example.entities.*;
import org.example.logic.logic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class frames {
    private JPanel rootPanel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private JTextField txtQueryDonor;
    private JTextField txtQueryDepot;
    private JTextField txtQuerySeeker;
    private JButton searchButton;
    private JTextField txtBloodPacket;
    private JTabbedPane tabbedPane1;
    private JTable showTable;
    private JButton executeButton;


    public frames(){ //call case with query


        executeButton.addActionListener(new ActionListener() { // call button to do something
            @Override
            public void actionPerformed(ActionEvent e) {
                String query;
                if (e.getSource() == executeButton){
                    if (!txtQueryDonor.getText().equals("")){
                        query = txtQueryDonor.getText();
                        createTable(3,query);               // call to creatable Donor
                        txtQueryDonor.setText("");
                    } else if (!txtBloodPacket.getText().equals("")) {
                        query = txtBloodPacket.getText();
                        createTable(4,query);               // call to creatable BPacket
                        txtBloodPacket.setText("");
                    } else if (!txtQueryDepot.getText().equals("")) {
                        query = txtQueryDepot.getText();
                        createTable(1,query);               // call to creatable Depot
                        txtQueryDepot.setText("");
                    }else if (!txtQuerySeeker.getText().equals("")){
                        query = txtQuerySeeker.getText();
                        createTable(2,query);               // call to creatable Seeker
                        txtQuerySeeker.setText("");
                    }

                }

            }
        });
    }



    private void createTable(int flag, String query){// must add flag to choose which kind of table
        logic lg = new logic();
        // FLAG option

        switch (flag){
            case 1:
                //table for DEPOT
                Object [][] data= lg.holdForDepot(query);  showTable.setModel(new DefaultTableModel(
                        data,
                        new String[] {"DepotID","Address","Name"}
                ));
                break;
            case 2:
                //table for SEEKER
                Object [][] data1= lg.holdForSeeker(query);
                showTable.setModel(new DefaultTableModel(
                        data1,
                        new String[] {"SeekerID","Name","Age","Address",
                                "BloodGroup","PhoneNum","CNIC","Sex","Registration"}
                ));
                break;
            case 3:
                // table for DONOR
                Object [][] data2= lg.holdForDonor(query);
                showTable.setModel(new DefaultTableModel(
                        data2,
                        new String[] {"DonorID","Name","Age","Address",
                                "BloodGroup","PhoneNum","CNIC","Sex"}
                ));
                break;
            case 4:
                // table for BLOOD
                Object [][] data3= lg.holdForBPacket(query);
                showTable.setModel(new DefaultTableModel(
                        data3,
                        new String[] {"PacketID","DonorID","DonationDate","BloodGroup",
                                "Volume","Status","Expiry","DepotID","SeekerID"}
                ));
                break;
        }
    }


}
