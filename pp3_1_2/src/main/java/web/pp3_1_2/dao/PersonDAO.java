package web.pp3_1_2.dao;


import web.pp3_1_2.models.Person;

import java.util.List;

public interface PersonDAO {

    public List<Person> index();
    public void save(Person person);
    public Person show(int id);
    public Person update(Person updatedPerson);
    public void delete(int id);
}
