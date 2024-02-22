package com.demo.repo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Person;

@SpringBootTest
class PersonRepoTest {


    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitsById() {
        Person person = new Person(123, "Durgesh", "Delhi");
        personRepo.save(person);
        Boolean actualResult = personRepo.isPersonExitsById(123);
        assertThat(actualResult).isTrue();
    }
    @Test

    @AfterEach
    void tearDown() {
        System.out.println("tearing down");
        personRepo.deleteAll();
    }
@Test
    @BeforeEach
    void setUp() {
        System.out.println("setting up");
    }
}