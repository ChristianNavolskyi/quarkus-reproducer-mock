package com.arconsis

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource(private val service: ExampleService) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = service.greeting(ExampleUser("Peter", "Griffin"))
}