package service;

import java.util.List;

public interface CommonService<T> {

    void add(T object);
    T getById(Integer id);
    List<T> getAll();
    void deleteById(Integer id);
    void updateOfName(String Name,Integer id);

//
//    T getCarById(int id);
//    List<T> getAllCar();
//    void create(T object);
//    void delete(int id);


}
