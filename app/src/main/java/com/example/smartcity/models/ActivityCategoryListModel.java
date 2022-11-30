package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActivityCategoryListModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public List<DataDTO> data;

    public static class DataDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("sort")
        public int sort;
        @SerializedName("imgUrl")
        public String imgUrl;
    }
}
