package service;

import domain.User;
import dto.UserDto;

import java.util.ArrayList;

public interface UserServiceImpl {
    public  void createUser(UserDto userDto);
    public void deleteUser(User user);
    public void update(UserDto userDto);
    public void showUsers();
}
