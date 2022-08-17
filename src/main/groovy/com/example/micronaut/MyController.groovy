package com.example.micronaut

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import jakarta.inject.Named

@Controller("/my")
class MyController {

    TeamConfiguration teamConfiguration
    StadiumConfiguration stadiumConfiguration

    MyController(TeamConfiguration teamConfiguration,
            @Named("pnc") StadiumConfiguration stadiumConfiguration) {
        this.teamConfiguration = teamConfiguration
        this.stadiumConfiguration = stadiumConfiguration
    }

    @Get("/team")
    TeamConfiguration team() {
        this.teamConfiguration
    }

    @Get("/stadium")
    StadiumConfiguration stadium() {
        this.stadiumConfiguration
    }
}