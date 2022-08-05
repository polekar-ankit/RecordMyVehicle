package com.gipl.recordmyvehicle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gipl.recordmyvehicle.ui.theme.RecordMyVehicleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            initView()
        }
    }

    @Composable
    private fun initView() {
        Scaffold(
            topBar = {
                TopAppBar(
                    content = { Text(text = "Record My Vehicle",
                        style = TextStyle(color = Color.White,
                            textAlign = TextAlign.Center,
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) },
                    backgroundColor = Color.Blue,
                    contentColor = Color.White,
                    elevation = 12.dp
                )
            },
            content = { Text("")}
        )
    }

    @Preview
    @Composable
    fun preViewLayout(){
        initView()
    }
}