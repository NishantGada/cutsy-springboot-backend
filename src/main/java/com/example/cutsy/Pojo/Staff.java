package com.example.cutsy.Pojo;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffID;
    private String staffFirstName;
    private String staffLastName;
    private String staffEmailID;
    private String staffPhone;
    private String staffPhoto;
    private String staffAddressLine1;
    private String staffAddressLine2;
    private String staffCity;
    private String staffPincode;
    private String staffState;
    private Double staffRating;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> staffReviewList;

    // Getters and Setters

    public Long getStaffID() {
        return staffID;
    }

    public void setStaffID(Long staffID) {
        this.staffID = staffID;
    }

    public String getStaffFirstName() {
        return staffFirstName;
    }

    public void setStaffFirstName(String staffFirstName) {
        this.staffFirstName = staffFirstName;
    }

    public String getStaffLastName() {
        return staffLastName;
    }

    public void setStaffLastName(String staffLastName) {
        this.staffLastName = staffLastName;
    }

    public String getStaffEmailID() {
        return staffEmailID;
    }

    public void setStaffEmailID(String staffEmailID) {
        this.staffEmailID = staffEmailID;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto;
    }

    public String getStaffAddressLine1() {
        return staffAddressLine1;
    }

    public void setStaffAddressLine1(String staffAddressLine1) {
        this.staffAddressLine1 = staffAddressLine1;
    }

    public String getStaffAddressLine2() {
        return staffAddressLine2;
    }

    public void setStaffAddressLine2(String staffAddressLine2) {
        this.staffAddressLine2 = staffAddressLine2;
    }

    public String getStaffCity() {
        return staffCity;
    }

    public void setStaffCity(String staffCity) {
        this.staffCity = staffCity;
    }

    public String getStaffPincode() {
        return staffPincode;
    }

    public void setStaffPincode(String staffPincode) {
        this.staffPincode = staffPincode;
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState;
    }

    public Double getStaffRating() {
        return staffRating;
    }

    public void setStaffRating(Double staffRating) {
        this.staffRating = staffRating;
    }

    public List<Review> getStaffReviewList() {
        return staffReviewList;
    }

    public void setStaffReviewList(List<Review> staffReviewList) {
        this.staffReviewList = staffReviewList;
    }

    // toString method
    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", staffFirstName='" + staffFirstName + '\'' +
                ", staffLastName='" + staffLastName + '\'' +
                ", staffEmailID='" + staffEmailID + '\'' +
                ", staffPhone='" + staffPhone + '\'' +
                ", staffPhoto='" + staffPhoto + '\'' +
                ", staffAddressLine1='" + staffAddressLine1 + '\'' +
                ", staffAddressLine2='" + staffAddressLine2 + '\'' +
                ", staffCity='" + staffCity + '\'' +
                ", staffPincode='" + staffPincode + '\'' +
                ", staffState='" + staffState + '\'' +
                ", staffRating=" + staffRating +
                ", staffReviewList=" + staffReviewList +
                '}';
    }
}

