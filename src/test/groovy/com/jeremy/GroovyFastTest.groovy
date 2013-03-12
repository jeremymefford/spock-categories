package com.jeremy

import spock.lang.Specification

/**
 * @author Jeremy Mefford
 */
@org.junit.experimental.categories.Category(com.jeremy.categories.GroovyFastTests)
class GroovyFastTest extends Specification {
    def "test 2"() {
        expect:
        1 == 1
    }
}
