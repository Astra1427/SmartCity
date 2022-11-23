package com.example.smartcity.models

import com.google.gson.annotations.SerializedName

class PinCity {
    @SerializedName("city")
    var city: List<CityDTO>? = null

    data class CityDTO(
        /**
         * title : A
         * lists : ["阿坝","阿拉善","阿里","安康","安庆","鞍山","安顺","安阳","澳门"]
         */
        @SerializedName("title")
        var title: String? = null,

        @SerializedName("lists")
        var lists: List<String>? = null
    ) {
    }
}