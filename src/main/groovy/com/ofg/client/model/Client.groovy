package com.ofg.client.model

import org.springframework.data.annotation.Id


class Client {
    @Id
    long id

    String firstName
    String lastName
    int age
    String loanId
}
