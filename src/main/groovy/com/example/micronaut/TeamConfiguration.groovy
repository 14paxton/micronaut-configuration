package com.example.micronaut


import io.micronaut.context.annotation.ConfigurationBuilder
import io.micronaut.context.annotation.ConfigurationProperties

//tag::teamConfigClassNoBuilder[]
@ConfigurationProperties("team")
class TeamConfiguration {
    String name
    String color
    List<String> playerNames
//end::teamConfigClassNoBuilder[]

    @ConfigurationBuilder(prefixes = "with", configurationPrefix = "team-admin")
    TeamAdmin.Builder builder = TeamAdmin.builder()
}

//tag::gettersandsetters[]
//end::gettersandsetters[]