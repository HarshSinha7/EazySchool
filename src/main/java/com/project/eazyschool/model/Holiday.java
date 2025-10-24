package com.project.eazyschool.model;

public class Holiday {

    private String day;
    private String reason;
    private Type type;   // refers to the enum defined below

    // Enum to define holiday types
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

    // ✅ Getters and Setters
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
