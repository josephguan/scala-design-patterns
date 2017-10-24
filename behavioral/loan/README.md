# Loan Pattern


## Intent
Loan Pattern as the name suggests would loan a resource to your function. So if you break out the sentence. It would

1. Create a resource which you can use
2. Loan the resources to the function which would use it
3. This function would be passed by the caller
4. The resource would be destroyed

As you would see, the advantages are multifold. First, I am not constrained by the function which can use the loaned resource. I can pass any function that I desire. Second, I am not concerned about the creation, destruction of the resource. The loan function takes care of it.


## Applicability



## Structure


## Participants

## Example
