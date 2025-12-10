package com.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "holidays")
@Data
public class Holiday {
    @Id
    private final String day;
    private final String reason;
    @Enumerated(EnumType.STRING)
    private final Type type;
    public enum Type {
        FESTIVAL, FEDERAL
    }
}
