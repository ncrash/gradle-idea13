package demo

/**
 * Created by ncrash on 2014. 4. 21..
 */
class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "Hello, Gradle!"

        where: hello = new Hello().sayHello()
    }
}
