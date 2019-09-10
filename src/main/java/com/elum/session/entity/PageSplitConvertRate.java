package com.elum.session.entity;

import java.io.Serializable;

public class PageSplitConvertRate implements Serializable {
    private Integer taskid;

    private String convertRate;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getConvertRate() {
        return convertRate;
    }

    public void setConvertRate(String convertRate) {
        this.convertRate = convertRate;
    }
}