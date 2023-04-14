package org.example.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "donortable")
public class Donor {

    @Id
    @Column(name = "DonorID")
    private String donorId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Address")
    private String address;

    @Column(name = "BloodGroup")
    private String bloodGroup;

    @Column(name = "PhoneNum")
    private String phoneNum;

    @Column(name = "CNIC")
    private String cnic;

    @Column(name = "Sex")
    private String sex;

}
