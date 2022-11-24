package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class PutCommonUserRequest {

    public PutCommonUserRequest(String email, String idCard, String nickName, String phonenumber, String sex) {
        this.email = email;
        this.idCard = idCard;
        this.nickName = nickName;
        this.phonenumber = phonenumber;
        this.sex = sex;
    }

    @SerializedName("email")
    public String email;
    @SerializedName("idCard")
    public String idCard;
    @SerializedName("nickName")
    public String nickName;
    @SerializedName("phonenumber")
    public String phonenumber;
    @SerializedName("sex")
    public String sex;
}
