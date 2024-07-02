package com.arconsis

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ExampleService {

    fun greeting(user: ExampleUser): String {
        return "Hello, ${user.name}!"
    }
}