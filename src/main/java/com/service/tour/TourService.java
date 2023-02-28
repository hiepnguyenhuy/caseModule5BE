package com.service.tour;

import com.model.Tour;
import com.repository.ITourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
@Service
public class TourService implements IProductIplm {
    @Autowired
    ITourRepo iTourRepo;


    @Override
    public List<Tour> findAll() {
        return (List<Tour>) iTourRepo.findAll();
    }

    @Override
    public void create(Tour tour) {
        iTourRepo.save(tour);
    }

    @Override
    public void delete(int id) {
        iTourRepo.deleteById(id);
    }

    @Override
    public Tour findById(int id) {
        return iTourRepo.findById(id).get();
    }

    @Override
    public List<Tour> findByNameLike(String text) {
        return iTourRepo.findAllByNameContaining(text);
    }

    public List<Tour> findAllByProvinceName(String provinceName){
        return iTourRepo.findAllByProvinceName(provinceName);
    }
}
