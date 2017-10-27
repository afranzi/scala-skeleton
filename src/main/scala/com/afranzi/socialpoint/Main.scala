package com.afranzi.socialpoint

object Main extends App {
  println("DataLab - Big Data Engineer")

  val argsParser = new ArgsParser(args)
  val dummies = argsParser.dummies

  println("Dummies", dummies)

}