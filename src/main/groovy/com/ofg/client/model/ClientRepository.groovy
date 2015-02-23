package com.ofg.client.model

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param


interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
    Client findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName)
    List<Client> findByLastName(@Param("name") String name)
    List<Client> findByLastNameIgnoreCase(@Param("name") String name)
}
