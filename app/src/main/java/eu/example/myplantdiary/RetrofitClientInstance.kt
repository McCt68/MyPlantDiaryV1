package eu.example.myplantdiary

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// there is only this one instance of this object / Also called static in Java, its a singleton I think ??
object RetrofitClientInstance {

	// This is kind of factory, it will initialize retrofit, and then return it to us ( not exactly sure what it means ??)
	private var retrofit: Retrofit? = null
	private val BASE_URL = "https://www.plantplaces.com"

	val retrofitInstance: Retrofit?
		get() {
			// check if object has been created yet ?
			if (retrofit == null) {
				// create object if it has not already been created
				retrofit = retrofit2.Retrofit.Builder()
					.baseUrl(BASE_URL)
					.addConverterFactory(GsonConverterFactory.create())
					.build()
			}
			return retrofit
		}
}