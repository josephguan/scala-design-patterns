# Design patterns implemented in Scala

Design patterns implemented in Scala.
Inspired by [Design patterns implemented in Java](https://github.com/iluwatar/java-design-patterns)



## Creational

|    Name         |      scala features     |functional|Gang of four| link
|-----------------|-------------------------|----------|------------|-------
|abstract factory | no                      | no       | yes        |[go](./creational/abstract-factory/)
|builder          | no                      | no       | yes        |[go](./creational/builder/)
|cake             | yes(trait mix-in)       | no       | no         |[go](./creational/cake/)
|factory kit      | no                      | yes      | no         |[go](./creational/factory-kit/)
|factory method   | no                      | no       | yes        |[go](./creational/factory-method/)
|prototype        | no                      | no       | yes        |[go](./creational/prototype/)
|simple factory   | yes(companion object)   | no       | no         |[go](./creational/simple-factory/)
|singleton        | yes(object)             | no       | yes        |[go](./creational/singleton/)
|value object     | yes(case class)         | no       | no         |[go](./creational/value-object/)


## Structural

|    Name    |      scala features     |functional|Gang of four|
|------------|-------------------------|----------|------------|
|adapter     | yes(implicit class)     | no       | yes        |
|bridge      | no                      | no       | yes        |
|composite   | no                      | no       | yes        |
|decorator   | yes(stackable trait)    | no       | yes        |
|facade      | no                      | no       | yes        |
|flyweight   | no                      | no       | yes        |
|magnet      | yes(implicit conversion)| no       | no         |
|proxy       | no                      | no       | yes        |
|type-clases | yes(impilict parameter) | no       | no         |


## Behavioral

|    Name         |       scala features    |functional|Gang of four|
|-----------------|-------------------------|----------|------------|
|chain of responsibility| no                | yes      | yes        |
|command          | no                      | yes      | yes        |
|loan             | yes(structural type,functional)|yes| no         |
|mediator         | no                      | no       | yes        |
|memento          | no                      | no       | yes        |
|observer         | no                      | no       | yes        |
|state            | no                      | no       | yes        |
|strategy         | no                      | yes      | yes        |
|template method  | no                      | no       | yes        |
|visitor          | no                      | yes      | yes        |