package org.lopertut;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int birthday_year;
    private int birthday_month;
    private int birthday_day;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, int birthday_year, int birthday_month, int birthday_day, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthday_year = birthday_year;
        this.birthday_month = birthday_month;
        this.birthday_day = birthday_day;
        this.address = address;
    }


//    public int getAge() {
//        LocalDate birthDate = LocalDate.of(birthday_year, birthday_month, birthday_day);
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday_year() {
        return birthday_year;
    }

    public void setBirthday_year(int birthday_year) {
        this.birthday_year = birthday_year;
    }

    public int getBirthday_month() {
        return birthday_month;
    }

    public void setBirthday_month(int birthday_month) {
        this.birthday_month = birthday_month;
    }

    public int getBirthday_day() {
        return birthday_day;
    }

    public void setBirthday_day(int birthday_day) {
        this.birthday_day = birthday_day;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthday_year == person.birthday_year && birthday_month == person.birthday_month && birthday_day == person.birthday_day && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday_year, birthday_month, birthday_day, address);
    }
}
