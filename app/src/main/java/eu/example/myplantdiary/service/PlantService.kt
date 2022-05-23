package eu.example.myplantdiary.service

import eu.example.myplantdiary.RetrofitClientInstance
import eu.example.myplantdiary.dao.IPlantDAO
import eu.example.myplantdiary.dto.Plant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.await
import retrofit2.awaitResponse

class PlantService {
	suspend fun fetchPlants(): List<Plant>? {
		return withContext(Dispatchers.IO) {
			val service = RetrofitClientInstance.retrofitInstance?.create(IPlantDAO::class.java)
			val plants = async { service?.getAllPlants() }
			var results = plants.await()?.awaitResponse()?.body()

			return@withContext results
		}
	}
}