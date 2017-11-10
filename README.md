# IntelliJProject01

Short overview on Java following the book
  "Die Programmiersprache Java", Ken Arnold, James Gosling, David Holmes @Addison-Wesley
  
# Basic Compilation Commands

> package main;

This means that your class resides in the `main` package, and its canonical name is `main.HelloWorld`.

Java requires that package names should also be mirrored in the directory structure. This means that:

1. Your `HelloWorld.java` file should be in a directory named `main`
2. You should execute `javac` and `java` from the directory containing `main`, not from `main` itself
3. The classpath should contain the directory where the `main` directory is, not `main` itself
4. `java` expects the canonical name of the class to execute, so `main.HelloWorld`

So, to recap:

You should have something like `myproject/main/HelloWorld.java`

From `myproject`, run `javac main/HelloWorld.java`

From `myproject`, run `java -cp ./ main.HelloWorld`


answered Jan 3 2013 at 3:36
Sergiu Dumitriu
8,73822155
https://stackoverflow.com/a/14132686 

linux - Exception in thread "main" java.lang.NoClassDefFoundError: H... https://stackoverflow.com/questions/14132602/exception-in-thread-mai...

# Useful Links

http://michael.hahsler.net/JAVA/ 

http://start.spring.io/
