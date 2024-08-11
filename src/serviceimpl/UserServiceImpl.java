package serviceimpl;

import entity.User;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "Fexri", "fexri@gmail.com", 26, "0554402066", "Aze"));
        userList.add(new User(2, "Kamran", "kamran@gmail.com", 30, "0504402066", "Aze"));
        userList.add(new User(3, "Hesen", "hesen@gmail.com", 35, "0704402066", "Aze"));
        userList.add(new User(4, "Elvin", "elvin@gmail.com", 40, "0554402021", "Aze"));
        userList.add(new User(5, "Fuad", "fuad@gmail.com", 45, "0554402022", "Georgia"));
    }


    @Override
    public void add(User object) {
        userList.add(object);
    }

    @Override
    public User getById(Integer id) {
        return userList.stream().filter(user -> user.getId().equals(id)).toList().get(0);
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void deleteById(Integer id) {
        userList.remove(userList.stream().filter(user -> user.getId().equals(id)));
    }

    @Override
    public void updateOfName(String Name, Integer id) {
        userList.get(id - 1).setName(Name);
    }

    @Override
    public List<User> getUserByNameLength(Integer length) {
        return userList.stream().filter(user->user.getName().length()>=length).toList();
    }

    @Override
    public List<User> getUserByAge(Integer age) {
        return userList.stream().filter(user->user.getAge()<age&&user.getAge()>age).toList();
    }
}
