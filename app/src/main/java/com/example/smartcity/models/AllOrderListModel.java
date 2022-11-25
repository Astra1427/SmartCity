package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllOrderListModel {

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
        @SerializedName("orderNo")
        public String orderNo;
        @SerializedName("amount")
        public float amount;
        @SerializedName("orderStatus")
        public String orderStatus;
        @SerializedName("userId")
        public int userId;
        @SerializedName("payTime")
        public String payTime;
        @SerializedName("name")
        public String name;
        @SerializedName("orderType")
        public String orderType;
        @SerializedName("orderTypeName")
        public String orderTypeName;
    }
}
