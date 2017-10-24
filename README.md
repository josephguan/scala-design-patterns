# Design patterns implemented in Scala

Inspired by [Design patterns implemented in Java](https://github.com/iluwatar/java-design-patterns)

## Introduction
Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.
The classical design patterns are the 23 design patterns by GoF.

This project implements dozens of design patterns in Scala.
The Scala language has several advanced features which make the implementations are different from other programming languages.

Design patterns are categorized into [Creational](#Creational), [Structural](#Structural) and [Behavioral](#Structural) categories.
For each design pattern, it tags:
1. **scala features** indicates if the implementation uses scala language-specific features.
2. **functional** indicates if the design pattern can be implemented in functional-programming style.
3. **Gang of four** indicates if the design pattern is one of the classical 23 design patterns by GoF


### Creational

|     Name                                             |      scala features        |functional|Gang of four|
|------------------------------------------------------|----------------------------|----------|------------|
|[abstract factory](./creational/abstract-factory/)    | no                         | no       | **yes**    |
|[builder](./creational/builder/)                      | no                         | no       | **yes**    |
|[cake](./creational/cake/)                            | **yes**(trait mix-in)      | no       | no         |
|[factory kit](./creational/factory-kit/)              | no                         | **yes**  | no         |
|[factory method](./creational/factory-method/)        | no                         | no       | **yes**    |
|[prototype](./creational/prototype/)                  | no                         | no       | **yes**    |
|[simple factory](./creational/simple-factory/)        | **yes**(companion object)  | no       | no         |
|[singleton](./creational/singleton/)                  | **yes**(object)            | no       | **yes**    |
|[value object](./creational/value-object/)            | **yes**(case class)        | no       | no         |


### Structural

|    Name                                              |      scala features         |functional|Gang of four|
|------------------------------------------------------|-----------------------------|----------|------------|
|[adapter](./structural/adapter/)                      | **yes**(implicit class)     | no       | **yes**    |
|[bridge](./structural/bridge/)                        | no                          | no       | **yes**    |
|[composite](./structural/composite/)                  | no                          | no       | **yes**    |
|[decorator](./structural/decorator/)                  | **yes**(stackable trait)    | no       | **yes**    |
|[facade](./structural/facade/)                        | no                          | no       | **yes**    |
|[flyweight](./structural/flyweight/)                  | no                          | no       | **yes**    |
|[magnet](./structural/magnet/)                        | **yes**(implicit conversion)| no       | no         |
|[proxy](./structural/proxy/)                          | no                          | no       | **yes**    |
|[type classes](./structural/type-classes/)            | **yes**(impilict parameter) | no       | no         |


### Behavioral

|    Name                                                         |      scala features     |functional|Gang of four|
|-----------------------------------------------------------------|-------------------------|----------|------------|
|[chain of responsibility](./behavioral/chain-of-responsibility/) | no                      | **yes**  | **yes**    |
|[command](./behavioral/command/)                                 | no                      | **yes**  | **yes**    |
|[loan](./behavioral/loan/)                                       | **yes**(structural type)| **yes**  | no         |
|[mediator](./behavioral/mediator/)                               | no                      | no       | **yes**    |
|[memento](./behavioral/memento/)                                 | no                      | no       | **yes**    |
|[observer](./behavioral/observer/)                               | no                      | no       | **yes**    |
|[state](./behavioral/state/)                                     | no                      | no       | **yes**    |
|[strategy](./behavioral/strategy/)                               | no                      | **yes**  | **yes**    |
|[template method](./behavioral/template-method/)                 | no                      | no       | **yes**    |
|[visitor](./behavioral/visitor/)                                 | no                      | **yes**  | **yes**    |



## Getting Started

Run ```sbt assembly``` to compile, run tests and package all sub-projects.

If you want to operate specific sub-project, use ```project``` command in sbt shell to switch sub-project:
```shell
> projects          // list all sub-projects
> project builder   // switch to 'builder' sub-project
> project all       // switch to 'all' project which including all sub-projects
```

## License
This project is licensed under the terms of the Apache 2.0 license.

