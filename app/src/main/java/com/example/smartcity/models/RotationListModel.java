package com.example.smartcity.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RotationListModel {

    /**
     * total : 3
     * rows : [{"searchValue":null,"createBy":"admin","createTime":"2021-05-06 15:40:17","updateBy":"1","updateTime":"2021-06-25 11:02:40","remark":null,"params":{},"id":25,"appType":"smart_city","status":"1","sort":2,"advTitle":"首页轮播","advImg":"/prod-api/profile/upload/image/2021/05/06/b9d9f081-8a76-41dc-8199-23bcb3a64fcc.png","servModule":"新闻详情","targetId":28,"type":"2"},{"searchValue":null,"createBy":"admin","createTime":"2021-05-06 15:40:59","updateBy":"1111129","updateTime":"2021-06-25 11:02:51","remark":null,"params":{},"id":26,"appType":"smart_city","status":"1","sort":3,"advTitle":"首页轮播","advImg":"/prod-api/profile/upload/image/2021/05/06/e614cb7f-63b0-4cda-bf47-db286ea1b074.png","servModule":"新闻详情","targetId":29,"type":"2"},{"searchValue":null,"createBy":"admin","createTime":"2021-05-06 15:41:20","updateBy":"1111129","updateTime":"2021-06-25 11:03:10","remark":null,"params":{},"id":27,"appType":"smart_city","status":"1","sort":4,"advTitle":"首页轮播","advImg":"/prod-api/profile/upload/image/2021/05/06/242e06f7-9fb0-4e16-b197-206f999c98f2.png","servModule":"新闻详情","targetId":30,"type":"2"}]
     * code : 200
     * msg : 查询成功
     */

    @SerializedName("total")
    public int total;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("rows")
    public List<RowsDTO> rows;

    public static class RowsDTO {
        /**
         * searchValue : null
         * createBy : admin
         * createTime : 2021-05-06 15:40:17
         * updateBy : 1
         * updateTime : 2021-06-25 11:02:40
         * remark : null
         * params : {}
         * id : 25
         * appType : smart_city
         * status : 1
         * sort : 2
         * advTitle : 首页轮播
         * advImg : /prod-api/profile/upload/image/2021/05/06/b9d9f081-8a76-41dc-8199-23bcb3a64fcc.png
         * servModule : 新闻详情
         * targetId : 28
         * type : 2
         */

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
        @SerializedName("status")
        public String status;
        @SerializedName("sort")
        public int sort;
        @SerializedName("advTitle")
        public String advTitle;
        @SerializedName("advImg")
        public String advImg;
        @SerializedName("servModule")
        public String servModule;
        @SerializedName("targetId")
        public int targetId;
        @SerializedName("type")
        public String type;

        public static class ParamsDTO {
        }
    }
}
