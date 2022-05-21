package eu.example.myplantdiary

import eu.example.myplantdiary.dto.Plant
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

	// my own test downwards from here
	@Test
	fun threePlusThree_EqualsSix() {
		assertEquals(6, 3 + 3)
		assertEquals("testWord", "testWord") // not in video
	}

	@Test
	fun threePlusFour_EqualsSeven() {
		assertEquals(7, 3 + 4)
	}

	@Test
	fun fourPlusFour_EqualsEight() {
		assertEquals(8, 4 + 4)
	}

	@Test // video 9
	fun confirmEasterRedbud_outputsEasternRedbud() {
		val plant: Plant = Plant("Cercis", "Canadendis", "EasternRedbud")
		// calling toString() on a Plant object return the value of common
		assertEquals("Eastern Redbud", plant.toString())
	}

	fun notUsed(){}

	@Test
	fun fivePlusFive_EqualsTen() {
		assertEquals(10, 5 + 5)
	}
}