package web.pp3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import web.pp3_1_2.models.Person;

import java.util.List;

@Component
public class PersonDAOImp implements PersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Person> index() {
        return em.createQuery("from Person", Person.class).getResultList();
    }

    @Override
    public void save(Person person) {
        em.persist(person);
        em.flush();
    }

    @Override
    public Person show(int id) {
        return em.find(Person.class, id);
    }

    @Override
    public Person update(Person updatedPerson) {
        return em.merge(updatedPerson);
    }

    @Override
    public void delete(int id) {
        em.remove(show(id));
        em.flush();
    }
}
