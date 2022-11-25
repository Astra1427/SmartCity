package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommonFeedBackModel {

    @SerializedName("code")
    public String code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("total")
    public String total;
    @SerializedName("rows")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("appType")
        public String appType;
        @SerializedName("title")
        public String title;
        @SerializedName("content")
        public String content;
        @SerializedName("userId")
        public int userId;
    }
}
