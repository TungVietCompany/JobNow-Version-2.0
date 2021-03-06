package com.jobnow.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class NotificationObject implements Serializable {
    public Integer id;

    @SerializedName("MembershipID")
    public String membershipId;

    @SerializedName("Title")
    public String title;

    @SerializedName("Content")
    public String content;

    @SerializedName("CreateDate")
    public String createDate;

    @SerializedName("created_at")
    public String created_at;

    @SerializedName("updated_at")
    public String updated_at;
}
