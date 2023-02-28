package com.service.tour;

import com.model.Tour;
import com.service.IGeneral;

import java.util.List;

public interface IProductIplm extends IGeneral<Tour> {
    List<Tour> findByNameLike(String text);
}
