# Loan Pattern


## Intent
Loan Pattern as the name suggests would loan a resource to your function. So if you break out the sentence. It would

1. Create a resource which you can use
2. Loan the resources to the function which would use it
3. This function would be passed by the caller
4. The resource would be destroyed


## Applicability
As you would see, the advantages are multifold.
* First, I am not constrained by the function which can use the loaned resource. I can pass any function that I desire.
* Second, I am not concerned about the creation, destruction of the resource. The loan function takes care of it.


## Structure
N/A


## Participants
N/A


## Example
In this example, the ```using``` loan a resource to a function and close the resource after the function finished using it.


## Scala Tips
Scala offers a functionality known as **Structural Types** which allows to set a behaviour
very similar to what dynamic languages allow to do when they support [Duck Typing](http://en.wikipedia.org/wiki/Duck_typing).


## Reference
[Understanding Loan Pattern](https://blog.knoldus.com/2012/11/16/scalaknol-understanding-loan-pattern/)
