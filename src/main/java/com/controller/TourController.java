package com.controller;

import com.model.Tour;
import com.service.tour.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tours")
public class TourController {
    @Autowired
    TourService tourService;

    @GetMapping
    public List<Tour> showAllTour() {
        return tourService.findAll();
    }

    @PostMapping
    public void create(@RequestBody Tour tour) {
        tourService.create(tour);
    }

    @GetMapping("/{id}")
    public Tour showEdit(@PathVariable int id) {
      return tourService.findById(id);
    }

    @PutMapping("/{id}")
    public void edit(@RequestBody Tour tour) {
        tourService.create(tour);
    }

    @GetMapping("/search/{provinceName}")
    public List<Tour> findByProvinceName(@PathVariable String provinceName) {
        return tourService.findAllByProvinceName(provinceName);
    }

}
