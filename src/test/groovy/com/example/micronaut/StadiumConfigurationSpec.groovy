package com.example.micronaut


import io.micronaut.context.ApplicationContext
import io.micronaut.inject.qualifiers.Qualifiers
import spock.lang.Specification

class StadiumConfigurationSpec extends Specification {

    void "test stadium configuration"() {
        given:
        ApplicationContext ctx = ApplicationContext.run(ApplicationContext, [
                "stadium.fenway.city": 'Boston',
                "stadium.fenway.size": 60000,
                "stadium.wrigley.city": 'Chicago',
                "stadium.wrigley.size": 45000
        ])

        when:

        StadiumConfiguration fenwayConfiguration = ctx.getBean(StadiumConfiguration, Qualifiers.byName("fenway"))
        StadiumConfiguration wrigleyConfiguration = ctx.getBean(StadiumConfiguration, Qualifiers.byName("wrigley"))

        then:
        fenwayConfiguration.name == "fenway"
        fenwayConfiguration.size == 60000
        wrigleyConfiguration.name == "wrigley"
        wrigleyConfiguration.size == 45000

        cleanup:
        ctx.close()
    }
}