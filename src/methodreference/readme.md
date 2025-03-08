# **Method Reference.**

-From Java 8.

* It is a supporting component for building lambda expression.
* MR is used when a method in a class with some business logic has to be written using lambda expression without duplicating the code again.
* MR are a special type of lambda expressions which are often used to create a simple lambda expressions by referring to a existing method.

Types of MR:
    
    1.Static MR. (Class::staticMethodName)
    2.Reference to instance method. (objRef::instanceMethodName)
    3.Reference to instance method from class type. (Class::instanceMethod)
    4.Constructor Reference. (Class::new) //Use this when you have the scenario where you want to create object of your class using Lambda Expression.

    :: -> (double colon) or Method Reference Delimeter.