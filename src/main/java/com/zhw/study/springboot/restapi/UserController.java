package com.zhw.study.springboot.restapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController("/user")
public class UserController {

    static final Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> allUsers = new ArrayList<>(users.values());
        return allUsers;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String addUser(User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String updateUser(@PathVariable Long id,User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}
