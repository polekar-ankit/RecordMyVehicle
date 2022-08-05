package com.gipl.recordmyvehicle

data class VehicleModel(
    val name:String,
    val type: VehicleType
)

enum class VehicleType{
    CAR,
    BIKE,
    E_BIKE,
}