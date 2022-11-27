package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetroRotationListModel {


    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("total")
    public int total;
    @SerializedName("rows")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("status")
        public String status;
        @SerializedName("sort")
        public int sort;
        @SerializedName("advTitle")
        public String advTitle;
        @SerializedName("advImg")
        public String advImg;
        @SerializedName("servModule")
        public String servModule;
        @SerializedName("targetId")
        public int targetId;
        @SerializedName("type")
        public String type;
    }
}
