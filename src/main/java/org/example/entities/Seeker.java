package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;



@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "seekertable")
public class Seeker {

    @Id
    @Column(name = "SeekerID")
    private String seekerId;

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

    @Column(name = "Registration")
    private Date registration;


}
