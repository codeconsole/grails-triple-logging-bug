package triple.logging.bug

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class BugControllerSpec extends Specification implements ControllerUnitTest<BugController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
