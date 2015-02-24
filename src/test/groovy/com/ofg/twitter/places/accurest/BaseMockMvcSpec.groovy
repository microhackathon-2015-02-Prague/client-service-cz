package com.ofg.twitter.places.accurest

import com.jayway.restassured.RestAssured
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import com.ofg.client.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

@IntegrationTest
@WebAppConfiguration
@ContextConfiguration(classes = Application, loader = SpringApplicationContextLoader)
abstract class BaseMockMvcSpec extends Specification {

    @Autowired WebApplicationContext webApplicationContext

    def setup() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext)
        RestAssured.port = 9058
    }

}
