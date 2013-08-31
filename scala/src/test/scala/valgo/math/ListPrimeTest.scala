package valgo.math

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import valgo.math._

class PrimeSuite extends FunSuite with BeforeAndAfter {

	var primer: Primer = _

	before {
		primer = new Primer
	}

	test("3 is a prime.") {
		assert(primer.isPrime(3))
	}
	test("4 is not a prime.") {
		assert(!primer.isPrime(4))
	}
}
