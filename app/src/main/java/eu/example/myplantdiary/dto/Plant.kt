package eu.example.myplantdiary.dto

// override toString to instead return commo ( not sure why??)
data class Plant(var genus: String, var species: String, var common: String) {
	override fun toString(): String {
		return common
	}
}