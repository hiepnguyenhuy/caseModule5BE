package com.repository;

import com.model.Tour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITourRepo extends PagingAndSortingRepository<Tour, Integer> {
    List<Tour> findAllByNameContaining(String textSearch);
    List<Tour> findAllByProvinceName(String provinceName);
}
