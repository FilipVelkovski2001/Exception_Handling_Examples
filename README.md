Java Exception Handling Examples!

What are Exceptions in Java?

In Java “an event that occurs during the execution of a program that disrupts the normal flow of instructions” is called an exception.
This is generally an unexpected or unwanted event which can occur either at compile-time or run-time in application code.
Java exceptions can be of several types and all exception types are organized in a fundamental hierarchy.

What kind of Exceptions exist?

- Checked Exceptions: 
Exceptions that can occur at compile-time are called checked exceptions since they need to be explicitly checked and handled in code.
Classes that directly inherit Throwable - except RuntimeException and Error - are checked exceptions e.g. IOException, InterruptedException

- Unchecked Exceptions
Unchecked exceptions can be thrown "at any time" (i.e. run-time). Therefore, methods don't have to explicitly catch or throw unchecked exceptions.
Classes that inherit RuntimeException are unchecked exceptions e.g. ArithmeticException, NullPointerException. 

The keywords for handling exceptions that we are going to go through today are:
- try
- catch
- finally
- throw
- throws