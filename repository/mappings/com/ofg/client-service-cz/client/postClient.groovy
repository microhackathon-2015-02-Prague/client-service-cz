io.coderate.accurest.dsl.GroovyDsl.make {
    request {
        method 'POST'
        url '/clients'
        headers {
            header 'Content-Type': 'application/hal+json'
        }
        body '''\
{
  "firstName" : "Test",
  "lastName" : "Test",
  "age" : 25,
  "loanId" : "testId",
}
'''
    }
    response {
        status 200
        headers {
            header 'Location': 'http://localhost:8095/clients/1'
        }
    }
}