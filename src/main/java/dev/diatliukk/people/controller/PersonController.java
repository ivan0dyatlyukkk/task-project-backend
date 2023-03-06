package dev.diatliukk.people.controller;

import dev.diatliukk.people.entity.PersonEntity;
import dev.diatliukk.people.model.Person;
import dev.diatliukk.people.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<Iterable<PersonEntity>> getPeople() {
        return new ResponseEntity<Iterable<PersonEntity>>(personService.getPeople(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<Optional<Person>>(personService.getPersonById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public HttpStatus savePerson(@RequestBody PersonEntity person) {
        personService.saveOrUpdate(person);
        return HttpStatus.OK;
    }
}
