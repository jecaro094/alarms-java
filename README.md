This repo covers some important concepts about OOP in Java, like:

- Interfaces
- Objects
- Classes
- Abstract Classes and Methods
- Polimorphism
- Inheritance

## Thanks to encapsulations, classes are...

- `Easier to use`: you only care about interface (public to the client), not the implementation (private)
- `Harder to misuse`: You protect objects from inconsistent changes.
- `Easier to change`: You can change the implementation without breaking clients.

## Important insights

- Inheritance is about `upcasting`. If I dont need to upcast, consider to avoid using polimorphism / inheritance...
- If I want to share some code, consider `delegation` (`Car` or `Boat` use class `Engine` to accelerate()) rather than using `polimorphism`. Prioritaze `delegation` to avoid coupled code.
- `Interface` vs `implementation` in class definition = `public` vs `private` in class definition

## Things to continue working on:

- `Records`: More oriented to `functional programming`
- `Generics`: Useful when using collections of objects. Very useful
- `Testing`: Discover how to.
- `Inner Classes`
  
## Design patters training on Pluralsight:

- Dan Geabunea; `Refactoring to SOLID Java`
- Bryan Hansen; `Java Creational Design Patterns`
- Andrejs Doronins; `Java Best Practices`