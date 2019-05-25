package com.vidyeshchuri;

public class Main {

    public static void main(String[] args) {
        // Hello World
/*  public
        It means that you can call this method from outside of the class you are currently in.
        This is necessary because this method is being called by the Java runtime system which is not located in your
        current class.
    static
        When the JVM makes call to the main method there is no object existing for the class being called therefore
        it has to have static method to allow invocation from class.
    void
        Java is platform independent language and if it will return some value then the value may mean different things
        to different platforms. Also there are other ways to exit the program on a multithreaded system.
    main
        It's just the name of method. This name is fixed and as it's called by the JVM as entry point for an
        application.
    String args[]
        These are the arguments of type String that your Java application accepts when you run it.
*/


        System.out.println("Hello World");

    }
}
