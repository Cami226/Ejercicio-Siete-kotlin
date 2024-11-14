package com.bootcamp.ejerciciosietekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*

import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.bootcamp.ejerciciosietekotlin.ui.theme.EjercicioSieteKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EjercicioSieteKotlinTheme {
                MainScreen()
                }
            }
        }
    }


@Composable

fun MainScreen() {
    var isImageVisible by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)

    ) {
        Text(
            text = "¡Bienvenidos!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "CAMILA GOMEZ VERDUGUEZ",
            fontSize =20.sp,
            fontWeight = FontWeight.Normal)

        Spacer(modifier = Modifier.height(16.dp))




        Button(onClick = { isImageVisible = !isImageVisible }) {
            Text(if (isImageVisible) "Ocultar Imagen" else "Mostrar Imagen")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (isImageVisible) {
            Image(
                painter = painterResource(id = R.drawable.mariposa_rosa),
                contentDescription = "Mariposa",
                modifier = Modifier
                    .size(400.dp)
                    .fillMaxWidth()
                    .height(200.dp)
            )
        }
    }
}
