package com.example.POCTaxNotification.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class NotificationData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long intimationId;
    public String taxpayerId;
    public String taxType;
    public LocalDate intimationDate;
    public double amount;
    public String status;
    public String remarks;
    public String sourceSystem;
    public String documentUrl;
}
