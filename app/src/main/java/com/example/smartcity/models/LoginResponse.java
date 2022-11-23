package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("token")
    public String token;
}
