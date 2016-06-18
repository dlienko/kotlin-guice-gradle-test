import com.google.inject.Guice

class Main {

    fun main(args: Array<String>) {
        println("running")

        val injector = Guice.createInjector(MainModule())
        val dependency = injector.getInstance(Dependency::class.java)
        val something = dependency.getSomething()
        println(something)
    }

}