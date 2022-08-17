package com.example.micronaut

import groovy.transform.CompileStatic

@CompileStatic
class TeamAdmin {

    String manager
    String coach
    String president

    // should use the builder pattern to create the object
    private TeamAdmin() {
    }

    static Builder builder() {
        return new Builder()
    }

    static class Builder {
        String manager
        String coach
        String president


        Builder withManager(String manager) {
            this.manager = manager
            this
        }

        Builder withCoach(String coach) {
            this.coach = coach
            this
        }

        Builder withPresident(String president) {
            this.president = president
            this
        }

        TeamAdmin build() {
            TeamAdmin teamAdmin = new TeamAdmin()
            teamAdmin.manager = this.manager
            teamAdmin.coach = this.coach
            teamAdmin.president = this.president
            teamAdmin
        }
    }
}