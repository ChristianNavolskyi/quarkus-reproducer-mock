package com.arconsis

import io.mockk.every
import io.quarkus.test.InjectMock
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class ExampleResourceTest {

    @InjectMock
    lateinit var service: ExampleService

    @Test
    fun testHelloEndpoint() {
        val expectedResult = "hello test"

        every { service.greeting(any()) } returns expectedResult

        given()
            .`when`().get("/hello")
            .then()
            .statusCode(200)
            .body(`is`(expectedResult))
    }

}