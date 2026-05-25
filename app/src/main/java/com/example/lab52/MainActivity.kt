package com.example.lab52

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab52.ui.theme.Lab52Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Lab52Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Cyan
                ) {

                    Greeting(
                        name = "Костянтин Красносельський "
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Text(
        text = "Hi, my name is $name"
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Lab52Theme {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Cyan
        ) {

            Greeting(
                name = "Красносельський Костянтин" помилка
            )

        }
    }
}