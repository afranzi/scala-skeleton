package com.afranzi.socialpoint

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

/**
  * FunSuite - http://www.scalatest.org/user_guide/selecting_a_style
  */
@RunWith(classOf[JUnitRunner])
abstract class UnitSpec extends FunSuite with Matchers with OptionValues with Inspectors
