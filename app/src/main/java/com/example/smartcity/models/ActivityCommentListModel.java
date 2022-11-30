package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActivityCommentListModel {

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
        @SerializedName("userId")
        public int userId;
        @SerializedName("activityId")
        public int activityId;
        @SerializedName("content")
        public String content;
        @SerializedName("commentTime")
        public String commentTime;
        @SerializedName("activityName")
        public String activityName;
        @SerializedName("userName")
        public String userName;
        @SerializedName("nickName")
        public String nickName;
        @SerializedName("avatar")
        public String avatar;
    }
}
