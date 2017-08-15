package iflyer.ribbon.service;

import iflyer.dao.UserDao;
import iflyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by liuxin on 17/1/20.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

//    @Autowired
//    RestTemplate restTemplate;
//
//    public String hiService(String name) {
//        return restTemplate.getForObject("http://EB-Pro/hi?name="+name,String.class);
//    }

    public List<User> getUsers(){
        List<User> users = userDao.queryAll();
        return users;
    }

    public User saveUser(String name,String age){
        User user = new User(/*name,age*/);
        return userDao.save(user);
    }



}
