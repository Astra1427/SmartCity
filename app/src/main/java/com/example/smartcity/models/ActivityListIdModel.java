package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class ActivityListIdModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public DataDTO data;

    public static class DataDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("content")
        public String content;
        @SerializedName("imgUrl")
        public String imgUrl;
        @SerializedName("categoryId")
        public int categoryId;
        @SerializedName("recommend")
        public String recommend;
        @SerializedName("signupNum")
        public int signupNum;
        @SerializedName("likeNum")
        public int likeNum;
        @SerializedName("status")
        public String status;
        @SerializedName("publishTime")
        public String publishTime;
        @SerializedName("categoryName")
        public String categoryName;
    }
}
