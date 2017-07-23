package com.webflow.objects;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User("user", "pass"));
    }

    public Boolean userExist(User user) {

            if (userList.contains(user)) {
                return true;
            }
        return false;
    }

    public String createUser(User user){
        for (User userExist : userList) {
            if (userExist.getName().equals(user.getName())) {
                return "exist";
            }
        }
        userList.add(user);
        return "success";
    }
}

