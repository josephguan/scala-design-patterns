
## Intent


## Applicability
method overloading in Scala comes with (at least) the following problems and inconveniences:

1. “Collisions” caused by type erasure
2. No lifting into a function (of all overloads at the same time)
3. Unavailability in package objects (before Scala 2.10)
4. Code duplication in case of many similar overloads

The magnet pattern can solve these issues

## Structure


## Participants

## Example


## Reference
http://spray.io/blog/2012-12-13-the-magnet-pattern/