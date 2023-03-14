package com.test

import com.knoldus.FindFactorial
import org.scalatest.funsuite.AnyFunSuite

class FindFactorialTest extends AnyFunSuite {
    val factorial = new FindFactorial

    test("Test of finding factorial is being done "){

      //Successful conditions (test cases will pass in these conditions)

      assert(factorial.findFactorial(5 ) == 120)
      assert(factorial.findFactorial(4 ) == 24)
      assert(factorial.findFactorial(6 ) == 720)
      assert(factorial.findFactorial(10 ) == 3628800)

      //Unsuccessful conditions (test cases will fail in these conditions)

      assert(factorial.findFactorial(6) != 720)
      assert(factorial.findFactorial(10) != 3628800)
    }
}