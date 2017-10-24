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

|    Name    |      scala features     |functional|Gang of four| link
|------------|-------------------------|----------|------------|-------
|adapter     | yes(implicit class)     | no       | yes        |[go](./structural/adapter/)
|bridge      | no                      | no       | yes        |[go](./structural/bridge/)
|composite   | no                      | no       | yes        |[go](./structural/composite/)
|decorator   | yes(stackable trait)    | no       | yes        |[go](./structural/decorator/)
|facade      | no                      | no       | yes        |[go](./structural/facade/)
|flyweight   | no                      | no       | yes        |[go](./structural/flyweight/)
|magnet      | yes(implicit conversion)| no       | no         |[go](./structural/magnet/)
|proxy       | no                      | no       | yes        |[go](./structural/proxy/)
|type classes| yes(impilict parameter) | no       | no         |[go](./structural/type-classes/)


## Behavioral

|    Name         |       scala features    |functional|Gang of four| link
|-----------------|-------------------------|----------|------------|-------
|chain of responsibility| no                | yes      | yes        |[go](./behavioral/chain-of-responsibility/)
|command          | no                      | yes      | yes        |[go](./behavioral/command/)
|loan             | yes(structural type,functional)|yes| no         |[go](./behavioral/loan/)
|mediator         | no                      | no       | yes        |[go](./behavioral/mediator/)
|memento          | no                      | no       | yes        |[go](./behavioral/memento/)
|observer         | no                      | no       | yes        |[go](./behavioral/observer/)
|state            | no                      | no       | yes        |[go](./behavioral/state/)
|strategy         | no                      | yes      | yes        |[go](./behavioral/strategy/)
|template method  | no                      | no       | yes        |[go](./behavioral/template-method/)
|visitor          | no                      | yes      | yes        |[go](./behavioral/visitor/)