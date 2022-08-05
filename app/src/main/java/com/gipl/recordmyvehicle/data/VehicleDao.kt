package com.gipl.recordmyvehicle.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface VehicleDao {
    @Insert
    fun addVehicle(tVehicles: TVehicles):Long

}

@Dao
interface VehicleDetailsDao{
    @Insert
    fun addVehicleDetails(tVehicleDetails: TVOperationDetails):Long
}