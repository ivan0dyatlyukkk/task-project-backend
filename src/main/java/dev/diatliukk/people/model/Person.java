package dev.diatliukk.people.model;

import dev.diatliukk.people.entity.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public static Person toModel(PersonEntity personEntity) {
        return new Person(personEntity.getId(), personEntity.getFirstName(), personEntity.getLastName(), calculateAge(personEntity.getDateOfBirth()) );
    }

    public static Integer calculateAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}
