package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParkLotListModel {

    @SerializedName("total")
    public int total;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("rows")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("parkName")
        public String parkName;
        @SerializedName("vacancy")
        public String vacancy;
        @SerializedName("priceCaps")
        public String priceCaps;
        @SerializedName("imgUrl")
        public String imgUrl;
        @SerializedName("rates")
        public String rates;
        @SerializedName("address")
        public String address;
        @SerializedName("distance")
        public String distance;
        @SerializedName("allPark")
        public String allPark;
        @SerializedName("open")
        public String open;
    }
}
