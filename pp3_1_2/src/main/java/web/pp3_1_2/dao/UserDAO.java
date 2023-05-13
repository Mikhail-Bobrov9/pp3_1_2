package web.pp3_1_2.dao;

import web.pp3_1_2.models.User;
import java.util.List;

public interface UserDAO {

    public List<User> index();
    public void save(User user);
    public User show(int id);
    public User update(User updatedUser);
    public void delete(int id);
}
