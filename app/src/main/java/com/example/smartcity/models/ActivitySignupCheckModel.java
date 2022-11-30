package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class ActivitySignupCheckModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("isSignup")
    public boolean isSignup;
    @SerializedName("id")
    public int id;
    @SerializedName("code")
    public int code;
}
