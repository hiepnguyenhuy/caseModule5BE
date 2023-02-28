package com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double prince;
    private Date startDay;
    private Date endDay;
    private String Status;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Province province;


}
