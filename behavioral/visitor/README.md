# Visitor Pattern


## Intent
Represent an operation to be performed on the elements of an object structure.
Visitor lets you define a new operation without changing the classes of the elements on which it operates.


## Applicability
Use the Visitor pattern when
* an object structure contains many classes of objects with differing interfaces,
and you want to perform operations on these objects that depend on their concrete classes.
* many distinct and unrelated operations need to be performed on objects in an object structure,
and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related
operations together by defining them in one class. When the object structure is shared by many applications,
use Visitor to put operations in just those applications that need them.
* the classes defining the object structure rarely change, but you often want to define new operations over the structure.
Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly.
If the object structure classes change often, then it's probably better to define the operations in those classes.


## Structure
![visitor](./etc/visitor.png)


## Participants
* **Visitor**
    - declares a Visit operation for each class of ConcreteElement in the object structure. The operation's name
    and signature identifies the class that sends the Visit request to the visitor. That lets the visitor determine
    the concrete class of the element being visited. Then the visitor can access the element directly through its particular interface.
* **ConcreteVisitor**
    - implements each operation declared by Visitor. Each operation implements a fragment of the algorithm defined for the corresponding
    class of object in the structure. ConcreteVisitor provides the context for the algorithm and stores its local state.
    This state often accumulates results during the traversal of the structure.
* **Element**
    - defines an Accept operation that takes a visitor as an argument.
* **ConcreteElement**
    - implements an Accept operation that takes a visitor as an argument.
* **ObjectStructure**
    - can enumerate its elements.
    - may provide a high-level interface to allow the visitor to visit its elements.
    - may either be a composite or a collection such as a list or a set.


## Example
Imagine there is a zoo, keeping animals like dolphin, lion, monkey, etc. God reserved a backdoor for
adding new features to these animals, such as speak/swim, without changing these animals, just by reading the magic spell.

Participants in this example:
* AnimalOperation is the **Visitor**.
* Speak/Swim is the **ConcreteElement**.
* Animal is the **Element**.
* Dolphin/Lion/Monkey is the **ConcreteElement**.
* Zoo is the **ObjectStructure**.


## Scala Tips
* The visitor can also be in a function. See 'fp' package in this example.


## Reference
* Design Patterns: Elements of Reusable Object-Oriented Software

