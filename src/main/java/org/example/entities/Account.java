package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    @Column(name = "Name" )
    private String userName;
    @Column(name = "Pass")
    private String passWord;
    @Column(name = "Type")
    private String typeOfAccount;

    public Account( String userName, String passWord, String typeOfAccount) {

        this.userName = userName;
        this.passWord = passWord;
        this.typeOfAccount = typeOfAccount;
    }
}
