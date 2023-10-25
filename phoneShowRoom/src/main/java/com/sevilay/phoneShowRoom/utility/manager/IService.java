package com.sevilay.phoneShowRoom.utility.manager;

import java.util.List;

public interface IService<T, ID> {

    T save(T entity);

    Iterable<T> saveAll(Iterable<T> entities);

    T update(T entity);

    void delete(T t);

    void deleteById(T t);

    List<T> findAll();


}
