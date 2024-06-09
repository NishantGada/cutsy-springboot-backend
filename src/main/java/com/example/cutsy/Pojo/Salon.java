package com.example.cutsy.Pojo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salonID;
    private String salonName;
    private String salonAddressLine1;
    private String salonAddressLine2;
    private String salonCity;
    private String salonState;
    private String salonPincode;
    private String salonCountry;
    private String salonEmail;
    private String salonPhone;
    private Double salonStarRating;
    // private List<String> salonStaffList;
    @OneToMany(mappedBy = "salon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Staff> salonStaffList;

    @OneToMany(mappedBy = "salon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> salonReviewsList;

    // Getters and Setters

    public Long getSalonID() {
        return salonID;
    }

    public void setSalonID(Long salonID) {
        this.salonID = salonID;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public String getSalonAddressLine1() {
        return salonAddressLine1;
    }

    public void setSalonAddressLine1(String salonAddressLine1) {
        this.salonAddressLine1 = salonAddressLine1;
    }

    public String getSalonAddressLine2() {
        return salonAddressLine2;
    }

    public void setSalonAddressLine2(String salonAddressLine2) {
        this.salonAddressLine2 = salonAddressLine2;
    }

    public String getSalonCity() {
        return salonCity;
    }

    public void setSalonCity(String salonCity) {
        this.salonCity = salonCity;
    }

    public String getSalonState() {
        return salonState;
    }

    public void setSalonState(String salonState) {
        this.salonState = salonState;
    }

    public String getSalonPincode() {
        return salonPincode;
    }

    public void setSalonPincode(String salonPincode) {
        this.salonPincode = salonPincode;
    }

    public String getSalonCountry() {
        return salonCountry;
    }

    public void setSalonCountry(String salonCountry) {
        this.salonCountry = salonCountry;
    }

    public String getSalonEmail() {
        return salonEmail;
    }

    public void setSalonEmail(String salonEmail) {
        this.salonEmail = salonEmail;
    }

    public String getSalonPhone() {
        return salonPhone;
    }

    public void setSalonPhone(String salonPhone) {
        this.salonPhone = salonPhone;
    }

    public List<Review> getSalonReviewsList() {
        return salonReviewsList;
    }

    public void setSalonReviewsList(List<Review> salonReviewsList) {
        this.salonReviewsList = salonReviewsList;
    }

    public Double getSalonStarRating() {
        return salonStarRating;
    }

    public void setSalonStarRating(Double salonStarRating) {
        this.salonStarRating = salonStarRating;
    }

    public List<Staff> getSalonStaffList() {
        return salonStaffList;
    }

    public void setSalonStaffList(List<Staff> salonStaffList) {
        this.salonStaffList = salonStaffList;
    }

    // toString method
    @Override
    public String toString() {
        return "Salon{" +
                "salonID=" + salonID +
                ", salonName='" + salonName + '\'' +
                ", salonAddressLine1='" + salonAddressLine1 + '\'' +
                ", salonAddressLine2='" + salonAddressLine2 + '\'' +
                ", salonCity='" + salonCity + '\'' +
                ", salonState='" + salonState + '\'' +
                ", salonPincode='" + salonPincode + '\'' +
                ", salonCountry='" + salonCountry + '\'' +
                ", salonEmail='" + salonEmail + '\'' +
                ", salonPhone='" + salonPhone + '\'' +
                ", salonReviewsList=" + salonReviewsList +
                ", salonStarRating=" + salonStarRating +
                ", salonStaffList=" + salonStaffList +
                '}';
    }
}

