package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.time.Instant;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long id;

    @Column
    @JsonIgnore
    Long created;

    @Column
    @JsonIgnore
    Long updated;

    @NotNull(message = "Full name is required")
    @Size(min = 2, max = 50, message = "Full name must be between 2 and 50 characters")
    @Column(nullable = false)
    private String fullName;

    @NotNull(message = "Email is required")
    @Size(min = 2, max = 100, message = "Email must be between 2 and 100 characters")
    @Email(message = "Email should be valid")
    @Column(nullable = false, unique = true)
    private String email;

    @Pattern(regexp = "^\\+\\d{6,14}$", message = "Phone number should start with '+' and be between 6 and 14 digits")
    @Column(nullable = true)
    private String phone;

    @Column(nullable = false)
    @JsonIgnore
    private boolean isActive = true;

    @PrePersist
    protected void onCreate() {
        created = Timestamp.from(Instant.now()).getTime();
        updated = Timestamp.from(Instant.now()).getTime();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = Timestamp.from(Instant.now()).getTime();
    }
}

