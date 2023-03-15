package com.knoldus
import scala.annotation.tailrec

class FindFactorial  {

  @tailrec
  final def findFactorial(number: Int,accumulator: BigInt = 1): BigInt = {
    if(number <= 1) accumulator else findFactorial(number - 1, number * accumulator)

  }
}

