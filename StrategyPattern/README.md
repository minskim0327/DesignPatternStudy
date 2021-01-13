## StrategyPattern

# Definition
Defines a set of algorithms into family, encapsulate these algorithms, and make them interchangeable. This pattern is useful when the algorithms vary independently from the clients who use them.

# Design Principles

- Identify the aspects that vary and separate them from what is constant
- Program to an interface, not an implementation, i.e.
  - the declared type of the variables should be a supertype, usually an abstract class or interface, so that the objects assigned to those variables can be of any concrete implementation of the supertype, which means the class declaring them doesn’t have to know about the actual object types
- Favor composition over inheritance (has-a is better than is-a)
  - composition: instead of inheriting algorithms, let an object have that algorithm
