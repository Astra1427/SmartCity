package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PressCatogoryModel {

    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("total")
    public String total;
    @SerializedName("data")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("appType")
        public String appType;
        @SerializedName("name")
        public String name;
        @SerializedName("sort")
        public int sort;
    }
}
