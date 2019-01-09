package com.gx.repository

trait Specification[T] {

  def specified(entity: T): Boolean

  def toSqlClauses(): String

}


trait AccountSpecification extends Specification[Account]

object AccountSpecification {

  class AgeBetweenSpec(from: Int, to: Int) extends AccountSpecification {
    override def specified(entity: Account): Boolean = {
      entity.age >= from && entity.age <= to
    }

    override def toSqlClauses(): String = {
      s"""age >= $from and age <= $to"""
    }
  }

  class NameEqualSpec(name: String) extends AccountSpecification {
    override def specified(entity: Account): Boolean = {
      entity.name.equalsIgnoreCase(name)
    }

    override def toSqlClauses(): String = {
      s"""name = $name"""
    }
  }

}