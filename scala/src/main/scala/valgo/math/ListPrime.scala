package valgo.math

import scala.math

class Primer() {
	def isPrime(value : Int) : Boolean = {
		val sqrt_n = scala.math.sqrt(value).ceil.toInt
		(2 to sqrt_n).toList.count(value % _==0) == 0
	}
}

object ListPrime {
	def main(args: Array[String]) = {
		val n = args(0).toDouble.ceil.toInt
		val p = new Primer
		(1 to n).filter(p.isPrime).foreach(println)
	}
}
