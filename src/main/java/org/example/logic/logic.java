package org.example.logic;

import org.example.entities.*;

import java.util.List;

public class logic {
    connectByOrm connectByOrm = new connectByOrm();

    public Object[][] holdForDepot(String query) {
        // call query


        List<Depot> dp = connectByOrm.qrDepotWithoutMap(query);

        Object [][] data = new Object[1000][1000];
        int count=0;
        for (Depot depot:dp){
            data[count][0]=depot.getDepotId();
            data[count][1]=depot.getName();
            data[count][2]=depot.getAddress();
            count++;

        }
        return data;
    }

    public Object[][] holdForSeeker(String query) {
        // call query


        List<Seeker> s = connectByOrm.qrSeekerWithoutMap(query);

        Object [][] data = new Object[1000][1000];
        int count=0;
        for (Seeker seeker:s){
            data[count][0]=seeker.getSeekerId();
            data[count][1]=seeker.getName();
            data[count][2]=seeker.getAge();
            data[count][3]=seeker.getAddress();
            data[count][4]=seeker.getBloodGroup();
            data[count][5]=seeker.getPhoneNum();
            data[count][6]=seeker.getCnic();
            data[count][7]=seeker.getSex();
            data[count][8]=seeker.getRegistration();
            count++;

        }
        return data;
    }

    public Object[][] holdForDonor(String query) {
        // call query

        List<Donor> d = connectByOrm.qrDonorWithoutMap(query);

        Object [][] data = new Object[1000][1000];
        int count=0;
        for (Donor donor:d){
            data[count][0]=donor.getDonorId();
            data[count][1]=donor.getName();
            data[count][2]=donor.getAge();
            data[count][3]=donor.getAddress();
            data[count][4]=donor.getBloodGroup();
            data[count][5]=donor.getPhoneNum();
            data[count][6]=donor.getCnic();
            data[count][7]=donor.getSex();
            count++;

        }
        return data;
    }

    public Object[][] holdForBPacket(String query) {
        // call query


        List<BloodPacket> bp = connectByOrm.qrBPWithoutMap(query);
        Object [][] data = new Object[1000][1000];
        int count=0;
        for (BloodPacket bloodPacket:bp){
            data[count][0]=bloodPacket.getPacketId();
            data[count][1]=bloodPacket.getDonorId();
            data[count][2]=bloodPacket.getDonationDate();
            data[count][3]=bloodPacket.getBloodGroup();
            data[count][4]=bloodPacket.getVolume();
            data[count][5]=bloodPacket.getStatus();
            data[count][6]=bloodPacket.getExpiry();
            data[count][7]=bloodPacket.getDepotId();
            data[count][8]=bloodPacket.getSeekerId();
            count++;

        }
        return data;
    }


}
