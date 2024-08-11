package service;

import entity.User;

import java.util.List;

public interface UserService {

    //Ad uzunluğu 6-dan boyuk olanları getirin
    List<User> getUserByNameLength(Integer length);

    //Yasi 20-den asabi ve yuxari olanları getiren metod yazin
    List<User> getUserByAge(Integer age);

}
