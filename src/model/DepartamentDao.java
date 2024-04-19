package model;

import java.util.List;

import entities.Department;

public interface DepartamentDao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer Id);

    Department findById(Integer id);

    List<Department> findAll();

}
