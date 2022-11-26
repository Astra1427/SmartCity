package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

public class GetPressPressIdModel {

    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public DataDTO data;
    @SerializedName("msg")
    public String msg;

    public static class DataDTO {
        @SerializedName("id")
        public int id;
        @SerializedName("appType")
        public String appType;
        @SerializedName("cover")
        public String cover;
        @SerializedName("title")
        public String title;
        @SerializedName("subTitle")
        public String subTitle;
        @SerializedName("content")
        public String content;
        @SerializedName("status")
        public String status;
        @SerializedName("publishDate")
        public String publishDate;
        @SerializedName("tags")
        public Object tags;
        @SerializedName("commentNum")
        public Object commentNum;
        @SerializedName("likeNum")
        public int likeNum;
        @SerializedName("readNum")
        public Object readNum;
        @SerializedName("type")
        public String type;
        @SerializedName("top")
        public String top;
        @SerializedName("hot")
        public String hot;
    }
}
