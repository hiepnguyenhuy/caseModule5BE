package com.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;

    @ManyToOne
    private Tour tour;
    @ManyToOne
    private Bill bill;
}
