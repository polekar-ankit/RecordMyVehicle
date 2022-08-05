package com.gipl.recordmyvehicle.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TVehicles::class, TVOperationDetails::class],
    version = 1,
    exportSchema = false
)
abstract class VehicleDb : RoomDatabase() {
    abstract fun vehicleDao(): VehicleDao
    abstract fun vehicleDetailsDao(): VehicleDetailsDao
}