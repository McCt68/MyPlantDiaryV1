package eu.example.myplantdiary.dto

import com.google.gson.annotations.SerializedName

// override toString to instead return common ( not sure why??)
data class Plant(
	@SerializedName("genus") var genus: String, // not sure if correct video 16
	var species: String,
	var common: String,
	var cultivar: String = "",
	var id: Int = 0
) {
	override fun toString(): String {
		return common
	}
}