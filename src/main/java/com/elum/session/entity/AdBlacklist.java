package com.elum.session.entity;

import java.io.Serializable;

public class AdBlacklist implements Serializable {
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}