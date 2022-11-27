package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMetroLineIdModel {

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
        @SerializedName("first")
        public String first;
        @SerializedName("end")
        public String end;
        @SerializedName("startTime")
        public String startTime;
        @SerializedName("endTime")
        public String endTime;
        @SerializedName("cityId")
        public int cityId;
        @SerializedName("stationsNumber")
        public Object stationsNumber;
        @SerializedName("km")
        public int km;
        @SerializedName("runStationsName")
        public String runStationsName;
        @SerializedName("remainingTime")
        public int remainingTime;
        @SerializedName("metroStepList")
        public List<MetroStepListDTO> metroStepList;

        public static class MetroStepListDTO {
            @SerializedName("searchValue")
            public Object searchValue;
            @SerializedName("createBy")
            public Object createBy;
            @SerializedName("createTime")
            public String createTime;
            @SerializedName("updateBy")
            public Object updateBy;
            @SerializedName("updateTime")
            public String updateTime;
            @SerializedName("remark")
            public Object remark;
            @SerializedName("params")
            public ParamsDTO params;
            @SerializedName("id")
            public int id;
            @SerializedName("name")
            public String name;
            @SerializedName("seq")
            public int seq;
            @SerializedName("lineId")
            public int lineId;
            @SerializedName("firstCh")
            public String firstCh;

            public static class ParamsDTO {
            }
        }
    }
}
