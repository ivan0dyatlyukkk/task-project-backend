package dev.diatliukk.people.model;

import dev.diatliukk.people.entity.PersonEntity;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void calculateAge() {
        PersonEntity person = new PersonEntity(1, "Ivan", "Diatliuk", LocalDate.of(2003, 1,26));

        int result = Person.calculateAge(person.getDateOfBirth());

        int expected = 20;

        assertEquals(expected, result);
    }

    @Test
    void toModel() {
        PersonEntity personEntity = new PersonEntity(1, "Ivan", "Diatliuk", LocalDate.of(2003, 1,26));

        Object result = Person.toModel(personEntity);

        assertEquals(Person.class, result.getClass());
    }
}