package model.dao;

import model.entities.Deparment;

import java.util.List;

public interface DepartmentDao {

    void insert(Deparment obj);
    void update(Deparment obj);
    void deleteById(Integer id);
    Deparment findById(Integer id);
    List<Deparment> findAll();
}
