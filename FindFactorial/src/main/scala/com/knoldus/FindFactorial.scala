package com.knoldus
import scala.annotation.tailrec

class FindFactorial  {

  @tailrec
  final def findFactorial(number: Int,accumulator: Long = 1): Long = {
    if(number <= 1) accumulator else findFactorial(number - 1, number * accumulator)

  }
}

