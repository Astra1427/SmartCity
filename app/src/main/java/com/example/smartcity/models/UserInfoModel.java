package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class UserInfoModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("user")
    public UserDTO user;

    public static class UserDTO {
        @SerializedName("userId")
        public int userId;
        @SerializedName("userName")
        public String userName;
        @SerializedName("nickName")
        public String nickName;
        @SerializedName("email")
        public String email;
        @SerializedName("phonenumber")
        public String phonenumber;
        @SerializedName("sex")
        public String sex;
        @SerializedName("avatar")
        public String avatar;
        @SerializedName("idCard")
        public String idCard;
        @SerializedName("balance")
        public float balance;
        @SerializedName("score")
        public int score;
    }
}
