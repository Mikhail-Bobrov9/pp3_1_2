package web.pp3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.pp3_1_2.models.User;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> index() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        em.persist(user);
        em.flush();
    }

    @Override
    public User show(int id) {
        return em.find(User.class, id);
    }

    @Override
    public User update(User updatedUser) {
        return em.merge(updatedUser);
    }

    @Override
    public void delete(int id) {
        em.remove(show(id));
        em.flush();
    }
}
