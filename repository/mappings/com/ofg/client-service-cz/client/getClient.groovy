io.coderate.accurest.dsl.GroovyDsl.make {
    request {

        method 'GET'
        url $(client(regex('/clients/[0-9]{2}')), server('/clients/1'))

    }
    response {
        status 200
        headers {
            header 'Content-Type': 'application/hal+json'
        }
        body '''\
{
  "firstName" : "Test",
  "lastName" : "Test",
  "age" : 25,
  "loanId" : "testId",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8095/clients/1"
    }
  }
}
'''
    }
}