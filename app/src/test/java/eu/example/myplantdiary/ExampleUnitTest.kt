package eu.example.myplantdiary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
	@Test
	fun addition_isCorrect() {
		assertEquals(4, 2 + 2)
	}

	// my own test
	@Test
	fun threePlusThree_EqualsSix(){
		assertEquals(6, 3+3)
		assertEquals("testWord", "testWord")
	}
}