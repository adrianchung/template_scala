package scalafun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldSuite extends FunSuite {

  test("A test case passes") {
    assert("Hey" == "Hey")
  }
}

