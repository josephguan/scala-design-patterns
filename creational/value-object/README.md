# Value Object Pattern

## Intent
Provide objects which follow value semantics rather than reference semantics.
This means value objects' equality are not based on identity. Two value objects are
equal when they have the same value, not necessarily being the same object.


## Applicability
Use the Value Object when
* you need to measure the objects' equality based on the objects' value


## Structure
N/A

## Participants
N/A

## Example
N/A

## Scala Tips
* Scala offers complete support for value objects directly in the language. That's **case class**.


## Reference
* [java design patterns](https://github.com/iluwatar/java-design-patterns/tree/master/value-object)