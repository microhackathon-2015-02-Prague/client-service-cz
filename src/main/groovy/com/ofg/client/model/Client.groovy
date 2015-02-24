package com.ofg.client.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    String firstName
    String lastName
    int age
    String loanId
}
