package com.ofg.twitter.places.accurest
import com.ofg.client.Application
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification

@IntegrationTest
@WebAppConfiguration
@ContextConfiguration(classes = Application, loader = SpringApplicationContextLoader)
abstract class BaseMockMvcSpec extends Specification {

    def setup() {

    }

}
