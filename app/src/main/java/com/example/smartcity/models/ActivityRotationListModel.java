package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActivityRotationListModel {

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
