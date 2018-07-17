# Chain Of Responsibility Pattern


## Intent
The chain of responsibility pattern decouples the sender of a request from its receiver,
by giving more than one object an opportunity to handle the request.
The request is processed by the chain until some object handles it.


## Applicability
Use Chain of Responsibility when

* more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
* you want to issue a request to one of several objects without specifying the receiver explicitly
* the set of objects that can handle a request should be specified dynamically


## Structure
![chain](./etc/chain.png)


## Participants
* **Handler**
    - defines an interface for handling requests.
    - (optional) implements the successor link.
* **ConcreteHandler**
    - handles requests it is responsible for.
    - can access its successor.
    - if the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor.
* **Client**
    - initiates the request to a ConcreteHandler object on the chain.
    it does not know anything about the handlers are in the chain, it just send the requests to the chain.


## Example
In this example, it demonstrates a software company handles customer's requests.

The SoftwareCommpany, as the interface who responses to customers' requests, constructs
the chain of responsibility -- different roles handling different requests:
developer can handle bugs, architect can handle features and CTO can handle products
-- customers don't need to know whom should the request send to, they just send
requests to the SoftwareCompany, in this way, it decouples the sender of a request from its receiver.

Participants in this example:
* App, as a customer, is the **Client**.
* RequestHandler is the **Handler**.
* Architect/CTO/Developer is the **ConcreteHandler**.


## Scala Tips
* The Handler can be treated as a function in type ```Request => Response```.
In scala, we can implement Handler by **partial function** and chain them (partial functions) together by orElse method.
Refer to the 'fp' package in this example for detail.


## Reference
* Design Patterns: Elements of Reusable Object-Oriented Software