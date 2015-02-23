package com.ofg.client.model

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param


interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    Person findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName)
    List<Person> findByLastName(@Param("name") String name)
    List<Person> findByLastNameIgnoreCase(@Param("name") String name)
}
