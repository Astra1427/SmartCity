package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetroFoundListModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public List<DataDTO> data;

    public static class DataDTO {
        @SerializedName("publishDate")
        public String publishDate;
        @SerializedName("metroFoundList")
        public List<MetroFoundListDTO> metroFoundList;

        public static class MetroFoundListDTO {
            @SerializedName("id")
            public int id;
            @SerializedName("imgUrl")
            public String imgUrl;
            @SerializedName("foundTime")
            public String foundTime;
            @SerializedName("foundPlace")
            public String foundPlace;
            @SerializedName("claimPlace")
            public String claimPlace;
        }
    }
}
