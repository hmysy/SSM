package com.fulan.server.model;

import java.io.Serializable;
import java.util.Date;

public class CarInformation implements Serializable {

    private String id;

    private String carLicenseNumber;

    private String carFrameNumber;

    private String carEngineNumber;

    private Date carFristRegistrationDate;

    private Long carPrice;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }

    public void setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber == null ? null : carLicenseNumber.trim();
    }

    public String getCarFrameNumber() {
        return carFrameNumber;
    }

    public void setCarFrameNumber(String carFrameNumber) {
        this.carFrameNumber = carFrameNumber == null ? null : carFrameNumber.trim();
    }

    public String getCarEngineNumber() {
        return carEngineNumber;
    }

    public void setCarEngineNumber(String carEngineNumber) {
        this.carEngineNumber = carEngineNumber == null ? null : carEngineNumber.trim();
    }

    public Date getCarFristRegistrationDate() {
        return carFristRegistrationDate;
    }

    public void setCarFristRegistrationDate(Date carFristRegistrationDate) {
        this.carFristRegistrationDate = carFristRegistrationDate;
    }

    public Long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Long carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carLicenseNumber=").append(carLicenseNumber);
        sb.append(", carFrameNumber=").append(carFrameNumber);
        sb.append(", carEngineNumber=").append(carEngineNumber);
        sb.append(", carFristRegistrationDate=").append(carFristRegistrationDate);
        sb.append(", carPrice=").append(carPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}