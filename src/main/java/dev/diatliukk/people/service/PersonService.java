package dev.diatliukk.people.service;

import dev.diatliukk.people.entity.PersonEntity;
import dev.diatliukk.people.model.Person;
import dev.diatliukk.people.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Iterable<PersonEntity> getPeople() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Integer id) {
        return personRepository.findById(id).isPresent() ?
                Optional.of(Person.toModel(personRepository.findById(id).get())) :
                Optional.empty();
    }

    public PersonEntity saveOrUpdate(PersonEntity person) {
        return personRepository.save(person);
    }

}
