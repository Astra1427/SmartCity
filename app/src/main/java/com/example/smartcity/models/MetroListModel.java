package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetroListModel {

    @SerializedName("msg")
    public String msg;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public List<DataDTO> data;

    public static class DataDTO {
        @SerializedName("lineId")
        public int lineId;
        @SerializedName("lineName")
        public String lineName;
        @SerializedName("preStep")
        public PreStepDTO preStep;
        @SerializedName("nextStep")
        public NextStepDTO nextStep;
        @SerializedName("currentName")
        public String currentName;
        @SerializedName("reachTime")
        public int reachTime;

        public static class PreStepDTO {
            @SerializedName("name")
            public String name;
            @SerializedName("lines")
            public List<LinesDTO> lines;

            public static class LinesDTO {
                @SerializedName("lineId")
                public int lineId;
                @SerializedName("lineName")
                public String lineName;
            }
        }

        public static class NextStepDTO {
            @SerializedName("name")
            public String name;
            @SerializedName("lines")
            public List<LinesDTO> lines;

            public static class LinesDTO {
                @SerializedName("lineId")
                public int lineId;
                @SerializedName("lineName")
                public String lineName;
            }
        }
    }
}
