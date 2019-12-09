package com.fulan.server.model;

import java.io.Serializable;

public class PolicyInformation implements Serializable {
    private String id;

    private String policyNumber;

    private String insuredName;

    private String insuredCertTpye;

    private String insuredCertNumber;

    private String insuredPhone;

    private String insuredAddress;

    private String insuredEmail;

    private String carFrameNumber;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber == null ? null : policyNumber.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getInsuredCertTpye() {
        return insuredCertTpye;
    }

    public void setInsuredCertTpye(String insuredCertTpye) {
        this.insuredCertTpye = insuredCertTpye == null ? null : insuredCertTpye.trim();
    }

    public String getInsuredCertNumber() {
        return insuredCertNumber;
    }

    public void setInsuredCertNumber(String insuredCertNumber) {
        this.insuredCertNumber = insuredCertNumber == null ? null : insuredCertNumber.trim();
    }

    public String getInsuredPhone() {
        return insuredPhone;
    }

    public void setInsuredPhone(String insuredPhone) {
        this.insuredPhone = insuredPhone == null ? null : insuredPhone.trim();
    }

    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress == null ? null : insuredAddress.trim();
    }

    public String getInsuredEmail() {
        return insuredEmail;
    }

    public void setInsuredEmail(String insuredEmail) {
        this.insuredEmail = insuredEmail == null ? null : insuredEmail.trim();
    }

    public String getCarFrameNumber() {
        return carFrameNumber;
    }

    public void setCarFrameNumber(String carFrameNumber) {
        this.carFrameNumber = carFrameNumber == null ? null : carFrameNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", policyNumber=").append(policyNumber);
        sb.append(", insuredName=").append(insuredName);
        sb.append(", insuredCertTpye=").append(insuredCertTpye);
        sb.append(", insuredCertNumber=").append(insuredCertNumber);
        sb.append(", insuredPhone=").append(insuredPhone);
        sb.append(", insuredAddress=").append(insuredAddress);
        sb.append(", insuredEmail=").append(insuredEmail);
        sb.append(", carFrameNumber=").append(carFrameNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}