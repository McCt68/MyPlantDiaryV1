package eu.example.myplantdiary

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import eu.example.myplantdiary.dto.Plant
import eu.example.myplantdiary.service.PlantService
import junit.framework.Assert.*
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class PlantTests {

	@get: Rule
	var rule: TestRule = InstantTaskExecutorRule()

	lateinit var plantService: PlantService

	// a var which is a list of plant
	var allPlants: List<Plant>? = ArrayList<Plant>()

	// I can have spaces in function names, when using the tick symbol
	@Test
	fun `Given plant data are available when I search for Redbud then I should receive Cercis canadensis`() = runTest {
		givenPlantServiceISInitialized()
		whenPlantDataAreReadAndParsed()
		thenThePlantCollectionShouldContainCercisCanadensis()
	}

	private fun givenPlantServiceISInitialized() {
		plantService = PlantService()
	}

	// video 15
	// we use a coroutine suspend function here, because this function will grab data from the internet
	private suspend fun whenPlantDataAreReadAndParsed() {
		allPlants = plantService.fetchPlants()
	}

	private fun thenThePlantCollectionShouldContainCercisCanadensis() {
		assertNotNull(allPlants)
		assertTrue(allPlants!!.isNotEmpty()) // we can use !! since we already check if the object is not null
		var containsCercisCanadensis = false
		allPlants!!.forEach {
			it
			if (it.genus.equals(("Cercis")) && it.species.equals("canadensis")) {
				containsCercisCanadensis = true
			}
		}
		assertTrue(containsCercisCanadensis)

//		assert(true)
//		assertEquals(2, 1+1)
	}
}