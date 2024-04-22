package model.dao;

import java.util.List;

import entities.Seller;

public interface DepartmentDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Seller Id);

    List<Seller> findAll();
}
