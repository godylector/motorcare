package com.example.myproject.model;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;

public class damageResponseData {
    @SerializedName("id")
    private Integer id;

    @SerializedName("bp_id")
    private Integer bp_id;

    @SerializedName("user_id")
    private Integer user_id;

    @SerializedName("dm_brand")
    private String dm_brand;

    @SerializedName("dm_color")
    private String dm_subbrand;

    @SerializedName("dm_details")
    private String dm_detilas;

    @SerializedName("dm_picture")
    private JSONArray dm_picture;

    @SerializedName("dm_vehicle")
    private String dm_vehicle;

    @SerializedName("dm_status")
    private Integer dm_status;

    @SerializedName("msg")
    private String msg;

    @SerializedName("value")
    private JsonArray value;

    public JsonArray getValue() {
        return value;
    }

    public String getMsg() {
        return msg;
    }

    public damageResponseData () {}


}
