package com.jeremy

import spock.lang.Specification

/**
 * @author Jeremy Mefford
 */
@org.junit.experimental.categories.Category(com.jeremy.categories.GroovySlowTests)
class GroovySlowTest extends Specification {
    def "test 1"() {
        expect:
        1 == 1
    }
}
