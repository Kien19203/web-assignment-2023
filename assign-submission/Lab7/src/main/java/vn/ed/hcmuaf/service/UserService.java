package vn.ed.hcmuaf.service;

import dao.UserDao;
import db.JDBIConnector;
import vn.ed.hcmuaf.bean.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {
    static Map<String, String> data = new HashMap<>();

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User checkLogin(String email, String pass) {
     User userByEmail =   UserDao.getUserByEmail(email);
     if(userByEmail != null && userByEmail.getEmail().equals(email) && userByEmail.getPassword().equals(pass)) return userByEmail;

     return null;
    }




}
