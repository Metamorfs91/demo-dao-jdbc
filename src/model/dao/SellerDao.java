package model.dao;

import java.util.List;

import entities.Department;

public interface SellerDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer Id);

    List<Department> findAll();
}
