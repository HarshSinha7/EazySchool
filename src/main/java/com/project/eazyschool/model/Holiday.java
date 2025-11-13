package com.project.eazyschool.model;

import lombok.Data;

@Data
public class Holiday {

    private String day;
    private String reason;
    private Type type;
    public enum Type {
        FEDERAL,
        FESTIVAL
    }
    // ✅ Constructor
    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }
}
