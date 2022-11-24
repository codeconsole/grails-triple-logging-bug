package triple.logging.bug

class BugController {

    def index() { 
        throw new RuntimeException("This should only log once!")
    }
}
