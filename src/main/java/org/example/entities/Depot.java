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
@Table(name = "depottable")
public class Depot {

    @Id
    @Column(name = "DepotID")
    private String DepotID;

    @Column(name = "Address")
    private String Address;
    @Column(name = "Name")
    private String Name;




}
