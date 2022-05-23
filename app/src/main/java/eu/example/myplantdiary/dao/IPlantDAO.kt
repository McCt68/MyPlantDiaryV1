package eu.example.myplantdiary.dao

import eu.example.myplantdiary.dto.Plant
import retrofit2.Call
import retrofit2.http.GET

// And interface is kinda a list of methods
interface IPlantDAO {

	// the url might be wrong or not able to access it
	@GET("perl/mobile/viewplantsjsonarray.pl")
	fun getAllPlants(): Call<ArrayList<Plant>>
}