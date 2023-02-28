package com.service;

import java.util.List;

public interface IGeneral<E> {
    List<E> findAll();

    void create(E e);

    void delete(int id);

    E findById(int id);
}
