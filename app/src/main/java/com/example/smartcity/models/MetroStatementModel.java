package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class MetroStatementModel {


    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public DataDTO data;

    public static class DataDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("title")
        public String title;
        @SerializedName("content")
        public String content;
        @SerializedName("type")
        public String type;
    }
}
