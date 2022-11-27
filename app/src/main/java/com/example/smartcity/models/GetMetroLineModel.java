package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMetroLineModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public DataDTO data;

    public static class DataDTO {
        @SerializedName("stepInfo")
        public StepInfoDTO stepInfo;
        @SerializedName("lineList")
        public List<LineListDTO> lineList;

        public static class StepInfoDTO {
            @SerializedName("name")
            public String name;
            @SerializedName("crowd")
            public int crowd;
        }

        public static class LineListDTO {
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
            @SerializedName("cityName")
            public String cityName;
        }
    }
}
