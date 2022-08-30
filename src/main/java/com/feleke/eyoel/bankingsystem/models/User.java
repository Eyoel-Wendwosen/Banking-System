package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class User {

    @SequenceGenerator(
            name = "user_id",
            sequenceName = "user_id",
            allocationSize = 2
    )
    @GeneratedValue(
            generator = "user_id",
            strategy = GenerationType.AUTO
    )
    @Id
    private Long id;
    private String name;
    private Date dateOfBirth;
    private Sex sex;
    private String phone;
    private String email;
    private String password;


    public User(String name, Date dateOfBirth, Sex sex, String phone, String email, String password) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
