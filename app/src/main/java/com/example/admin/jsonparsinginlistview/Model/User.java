package com.example.admin.jsonparsinginlistview.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("trc_id")
    @Expose
    private String trcId;
    @SerializedName("trc_full_name")
    @Expose
    private String trcFullName;
    @SerializedName("trc_email")
    @Expose
    private String trcEmail;
    @SerializedName("trc_profile_pic")
    @Expose
    private String trcProfilePic;
    @SerializedName("trc_address")
    @Expose
    private String trcAddress;
    @SerializedName("trc_address1")
    @Expose
    private String trcAddress1;
    @SerializedName("trc_city")
    @Expose
    private String trcCity;
    @SerializedName("trc_postcode")
    @Expose
    private String trcPostcode;
    @SerializedName("trc_calling_note")
    @Expose
    private String trcCallingNote;
    @SerializedName("trc_mobile_no")
    @Expose
    private String trcMobileNo;
    @SerializedName("trc_cust_status")
    @Expose
    private String trcCustStatus;
    @SerializedName("trc_cust_ip_address")
    @Expose
    private String trcCustIpAddress;
    @SerializedName("trc_reg_date")
    @Expose
    private String trcRegDate;

    public String getTrcId() {
        return trcId;
    }

    public void setTrcId(String trcId) {
        this.trcId = trcId;
    }

    public String getTrcFullName() {
        return trcFullName;
    }

    public void setTrcFullName(String trcFullName) {
        this.trcFullName = trcFullName;
    }

    public String getTrcEmail() {
        return trcEmail;
    }

    public void setTrcEmail(String trcEmail) {
        this.trcEmail = trcEmail;
    }

    public String getTrcProfilePic() {
        return trcProfilePic;
    }

    public void setTrcProfilePic(String trcProfilePic) {
        this.trcProfilePic = trcProfilePic;
    }

    public String getTrcAddress() {
        return trcAddress;
    }

    public void setTrcAddress(String trcAddress) {
        this.trcAddress = trcAddress;
    }

    public String getTrcAddress1() {
        return trcAddress1;
    }

    public void setTrcAddress1(String trcAddress1) {
        this.trcAddress1 = trcAddress1;
    }

    public String getTrcCity() {
        return trcCity;
    }

    public void setTrcCity(String trcCity) {
        this.trcCity = trcCity;
    }

    public String getTrcPostcode() {
        return trcPostcode;
    }

    public void setTrcPostcode(String trcPostcode) {
        this.trcPostcode = trcPostcode;
    }

    public String getTrcCallingNote() {
        return trcCallingNote;
    }

    public void setTrcCallingNote(String trcCallingNote) {
        this.trcCallingNote = trcCallingNote;
    }

    public String getTrcMobileNo() {
        return trcMobileNo;
    }

    public void setTrcMobileNo(String trcMobileNo) {
        this.trcMobileNo = trcMobileNo;
    }

    public String getTrcCustStatus() {
        return trcCustStatus;
    }

    public void setTrcCustStatus(String trcCustStatus) {
        this.trcCustStatus = trcCustStatus;
    }

    public String getTrcCustIpAddress() {
        return trcCustIpAddress;
    }

    public void setTrcCustIpAddress(String trcCustIpAddress) {
        this.trcCustIpAddress = trcCustIpAddress;
    }

    public String getTrcRegDate() {
        return trcRegDate;
    }

    public void setTrcRegDate(String trcRegDate) {
        this.trcRegDate = trcRegDate;
    }

}

