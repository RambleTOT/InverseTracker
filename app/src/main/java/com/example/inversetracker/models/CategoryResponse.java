package com.example.inversetracker.models;

import com.google.gson.annotations.SerializedName;

public class CategoryResponse {

    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
