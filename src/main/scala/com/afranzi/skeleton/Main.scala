package com.afranzi.skeleton

object Main extends App {

  val argsParser = new ArgsParser(args)
  val dummies = argsParser.dummies

  println("Dummies", dummies)

}