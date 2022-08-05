package com.gipl.recordmyvehicle.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.gipl.recordmyvehicle.VehicleModel
import com.gipl.recordmyvehicle.R
import com.gipl.recordmyvehicle.VehicleType

@Composable
fun Home() {
    val viewModel = remember {HomeViewModel()}
    Column(modifier = Modifier.fillMaxWidth()) {

    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun vehicleItem(vehicleModel: VehicleModel?) {
    Surface {
        Row {
            if (vehicleModel == null) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "", tint = Color.Blue)
                Text(text = "Add Vehicle", fontWeight = FontWeight.Bold, color = Color.Green, fontSize = 20.sp)
            } else {
                Icon(
                    painter = painterResource(
                        id = when (vehicleModel.type) {
                            VehicleType.CAR -> R.drawable.ic_car
                            VehicleType.BIKE -> R.drawable.ic_two_wheeler
                            else -> R.drawable.ic_car
                        }
                    ),
                    contentDescription = ""
                )
                Text(
                    text = vehicleModel.name,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green,
                    fontSize = TextUnit(
                        20f,
                        TextUnitType.Sp
                    )
                )
            }
        }
    }
}