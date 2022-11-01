package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public void removeUser(Long id);

    public User findById(Long id);

    public void updateUser(User user);
}
