package com.gx.repository

import com.gx.repository

object App extends App {

  val repository = new AccountRepositoryInMemory()

  val abby = Account(1, "abby", 10)
  val bobby = Account(2, "bobby", 11)
  val cathy = Account(3, "cathy", 12)

  // add
  repository.save(abby)
  repository.save(bobby)
  repository.save(cathy)
  println(repository.findAll())

  // update
  val bobby2 = bobby.copy(age = 15)
  repository.save(bobby2)
  println(repository.findAll())

  // delete
  repository.delete(cathy)
  repository.deleteById(bobby2.id)
  println(repository.findAll())

  // restore
  repository.save(bobby)
  repository.save(cathy)

  // find by id
  println(repository.findById(2))

  // find by age
  println(repository.findAll(new AccountSpecification.AgeBetweenSpec(5,11)))

  // find by name
  println(repository.findAll(new AccountSpecification.NameEqualSpec("Bobby")))




}
