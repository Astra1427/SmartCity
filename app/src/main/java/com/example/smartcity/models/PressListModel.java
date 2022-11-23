package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PressListModel {

    @SerializedName("total")
    public int total;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("rows")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        @SerializedName("searchValue")
        public Object searchValue;
        @SerializedName("createBy")
        public String createBy;
        @SerializedName("createTime")
        public String createTime;
        @SerializedName("updateBy")
        public String updateBy;
        @SerializedName("updateTime")
        public String updateTime;
        @SerializedName("remark")
        public Object remark;
        @SerializedName("params")
        public ParamsDTO params;
        @SerializedName("id")
        public int id;
        @SerializedName("appType")
        public String appType;
        @SerializedName("cover")
        public String cover;
        @SerializedName("title")
        public String title;
        @SerializedName("subTitle")
        public Object subTitle;
        @SerializedName("content")
        public String content;
        @SerializedName("status")
        public String status;
        @SerializedName("publishDate")
        public String publishDate;
        @SerializedName("tags")
        public Object tags;
        @SerializedName("commentNum")
        public int commentNum;
        @SerializedName("likeNum")
        public int likeNum;
        @SerializedName("readNum")
        public int readNum;
        @SerializedName("type")
        public String type;
        @SerializedName("top")
        public String top;
        @SerializedName("hot")
        public String hot;

        public static class ParamsDTO {
        }
    }
}
