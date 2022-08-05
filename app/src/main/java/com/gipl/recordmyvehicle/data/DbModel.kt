package com.gipl.recordmyvehicle.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TVehicles")
data class TVehicles(
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: Int,
    @ColumnInfo(name = "model") val model: String?,
    @ColumnInfo(name = "purchaseDate") val purchaseDate: String
) {
    @PrimaryKey(autoGenerate = true)
    val i: Long = 0
}

@Entity(tableName = "TVOperationDetails")
data class TVOperationDetails(
    @ColumnInfo(name = "vehicleFk") val vehicleFk: Int,
    @ColumnInfo(name = "operationType") val operationType: String,
    @ColumnInfo(name = "operationDate") val operationDate: String,
    @ColumnInfo(name = "operationStatus") val operationStatus: Int,
    @ColumnInfo(name = "odometerReading") val reading: Double,
    @ColumnInfo(name = "recordStatus") val recordStatus: Int,
    @ColumnInfo(name = "updateDate") val updateDate: String
) {
    @PrimaryKey(autoGenerate = true)
    val i: Long = 0
}