package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "bloodpackettable")
public class BloodPacket {

    @Id
    @Column(name = "PacketID")
    private String packetId;


    @Column(name = "DonorID",insertable = false, updatable = false)
    private String donorId;

    @Column(name = "DonationDate")
    private String donationDate;

    @Column(name = "BloodGroup")
    private String bloodGroup;

    @Column(name = "Volume")
    private Integer volume;

    @Column(name = "Status")
    private String status;

    @Column(name = "Expiry")
    private String expiry;

    @Column(name = "DepotID",insertable = false, updatable = false)
    private String depotID;


    @Column(name = "SeekerID", insertable = false, updatable = false)
    private String seekerId;



}
