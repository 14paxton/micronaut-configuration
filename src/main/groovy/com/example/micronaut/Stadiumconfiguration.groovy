package com.example.micronaut

import io.micronaut.context.annotation.EachProperty
import io.micronaut.context.annotation.Parameter

@EachProperty("stadium")
class StadiumConfiguration {
    String name
    String city
    Integer size

    StadiumConfiguration(@Parameter String name) {
        this.name = name
    }

}