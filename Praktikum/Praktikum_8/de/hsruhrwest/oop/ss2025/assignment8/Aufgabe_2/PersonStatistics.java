package Praktikum.Praktikum_8.de.hsruhrwest.oop.ss2025.assignment8.Aufgabe_2;

import java.util.List;

public class PersonStatistics {
    private List<Person> persons;

    public PersonStatistics(List<Person> persons) {
        this.persons = persons;
    }

    public Person getYoungestPerson() throws EmptyListException, NonUniquePersonFoundException {
        if (persons.isEmpty()) {
            throw new EmptyListException();
        }
        Person youngest = persons.getFirst();
        int count = 0;
        for (Person person : persons) {
            if (person.getAge() < youngest.getAge()) {
                youngest = person;
                count = 1;
            } else if (person.getAge() == youngest.getAge()) {
                count++;
            }
        }
        if (count > 1) {
            throw new NonUniquePersonFoundException(youngest.getAge());
        }
        return youngest;
    }

    public Person getOldestPerson() throws EmptyListException, NonUniquePersonFoundException {
        if (persons.isEmpty()) {
            throw new EmptyListException();
        }
        Person oldest = persons.getFirst();
        int count = 0;
        for (Person person : persons) {
            if (person.getAge() > oldest.getAge()) {
                oldest = person;
                count = 1;
            } else if (person.getAge() == oldest.getAge()) {
                count++;
            }
        }
        if (count > 1) {
            throw new NonUniquePersonFoundException(oldest.getAge());
        }
        return oldest;
    }

    public void printYoungestAndOldestPerson() throws CouldNotCreateStatisticException {
        try {
            Person youngest = getYoungestPerson();
            Person oldest = getOldestPerson();
            System.out.println("Youngest: " + youngest);
            System.out.println("Oldest: " + oldest);
        } catch (Exception e) {
            throw new CouldNotCreateStatisticException(e);
        }
    }
}
