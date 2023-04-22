package com.synthia.TestApp;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;
@Entity
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "childId", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "place_of_birth", nullable = false)
    private String placeOfBirth;

    @JsonFormat(pattern = "dd-MM-YYYY")
    @Column(name = "date_of_birth", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date dateOfBirth;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "age_of_mother", nullable = false)
    private int ageOfMother;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "marital_status")
    private String maritalStatus;

    public Date getDateOfBirth() {
        return dateOfBirth;
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

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAgeOfMother() {
        return ageOfMother;
    }

    public void setAgeOfMother(int ageOfMother) {
        this.ageOfMother = ageOfMother;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
