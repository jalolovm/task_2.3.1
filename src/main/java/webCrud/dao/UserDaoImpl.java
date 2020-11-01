package webCrud.dao;

import org.springframework.stereotype.Repository;
import webCrud.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
