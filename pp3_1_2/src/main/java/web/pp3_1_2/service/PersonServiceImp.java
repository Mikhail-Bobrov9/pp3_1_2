package web.pp3_1_2.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.pp3_1_2.dao.PersonDAO;
import web.pp3_1_2.models.Person;

import java.util.List;


@Component
@Transactional
public class PersonServiceImp implements PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonServiceImp(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public List<Person> index() {
        return personDAO.index();
    }

    @Override
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    public Person show(int id) {
        return personDAO.show(id);
    }

    @Override
    public Person update(Person updatedPerson) {
        return personDAO.update(updatedPerson);
    }

    @Override
    public void delete(int id) {
        personDAO.delete(id);
    }
}
