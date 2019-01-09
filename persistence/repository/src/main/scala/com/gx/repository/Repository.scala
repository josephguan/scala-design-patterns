package com.gx.repository

import scala.collection.mutable


trait Repository[T, ID] {

  // add or update
  def save(entity: T): Unit

  def delete(entity: T): Unit

  def deleteById(id: ID): Unit

  def findById(id: ID): Option[T]

  def findAll(spec: Specification[T] = null): List[T]

}


trait AccountRepository extends Repository[Account, Int]


// In Memory
class AccountRepositoryInMemory extends AccountRepository {

  val repository: mutable.HashMap[Int, Account] = new mutable.HashMap[Int, Account]()

  override def save(entity: Account): Unit = {
    // add or update
    repository.put(entity.id, entity)
  }

  override def delete(entity: Account): Unit = {
    repository.remove(entity.id)
  }

  override def deleteById(id: Int): Unit = {
    repository.remove(id)
  }

  override def findById(id: Int): Option[Account] = {
    repository.get(id)
  }

  override def findAll(spec: Specification[Account] = null): List[Account] = {
    if (spec == null) repository.values.toList
    else repository.values.filter(x => spec.specified(x)).toList
  }
}


// In Database
class AccountRepositoryInDatabase extends AccountRepository {

  override def save(entity: Account): Unit = {
    // add or update
    val upsert =
      s"""INSERT INTO table_account (id, name, age) VALUES(${entity.id}, ${entity.name}, ${entity.age})
         |ON DUPLICATE KEY UPDATE name=${entity.name}, age=${entity.age}"""
    execute(upsert)
  }

  override def delete(entity: Account): Unit = {
    val del = s"""DELETE FROM table_account WHERE id = ${entity.id}"""
    execute(del)

  }

  override def deleteById(id: Int): Unit = {
    val del = s"""DELETE FROM table_account WHERE id = $id"""
    execute(del)
  }

  override def findById(id: Int): Option[Account] = {
    val sql = s"""SELECT id, name, age FROM table_account WHERE id = $id"""
    val result = query(sql)
    // convert query result to Account object
    Some(Account(id, "dummy", 0))
  }

  override def findAll(spec: Specification[Account] = null): List[Account] = {
    val sql = s"""SELECT id, name, age FROM table_account WHERE ${spec.toSqlClauses()}"""
    val result = query(sql)
    // convert query result to Account object
    List(Account(1, "dummy", 0))
  }

  // dummy query
  private def query(sql: String): List[List[String]] = Nil

  // dummy execute sql
  private def execute(sql: String): Unit = {}

}