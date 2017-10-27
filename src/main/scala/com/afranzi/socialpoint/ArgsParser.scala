package com.afranzi.socialpoint

import org.rogach.scallop.{ScallopConf, ScallopOption}

class ArgsParser(arguments: Seq[String]) extends ScallopConf(arguments) {

  val dummies: ScallopOption[Int] = opt[Int](required = true)

  verify()
}