package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PressCommentListModel {

    @SerializedName("code")
    public int code;
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
        @SerializedName("newsId")
        public int newsId;
        @SerializedName("content")
        public String content;
        @SerializedName("commentDate")
        public String commentDate;
        @SerializedName("userId")
        public int userId;
        @SerializedName("likeNum")
        public int likeNum;
        @SerializedName("userName")
        public String userName;
        @SerializedName("newsTitle")
        public String newsTitle;
    }
}
