package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetroNoticeListModel {

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
        @SerializedName("title")
        public String title;
        @SerializedName("content")
        public String content;
    }
}
