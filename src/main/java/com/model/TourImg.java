package com.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class TourImg {
    @Id
    @GeneratedValue
    private int id;
    private String img;
    @ManyToOne
    private Tour tour;
}
