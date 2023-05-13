package web.pp3_1_2.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.pp3_1_2.dao.UserDAO;

import web.pp3_1_2.models.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    public User update(User updatedUser) {
        return userDAO.update(updatedUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
