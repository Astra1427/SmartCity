package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class RegisterRequest {
    public RegisterRequest(String avatar, String userName, String nickName, String password, String phonenumber, String sex, String email, String idCard) {
        this.avatar = avatar;
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.email = email;
        this.idCard = idCard;
    }

    @SerializedName("avatar")
    public String avatar;
    @SerializedName("userName")
    public String userName;
    @SerializedName("nickName")
    public String nickName;
    @SerializedName("password")
    public String password;
    @SerializedName("phonenumber")
    public String phonenumber;
    @SerializedName("sex")
    public String sex;
    @SerializedName("email")
    public String email;
    @SerializedName("idCard")
    public String idCard;
}
