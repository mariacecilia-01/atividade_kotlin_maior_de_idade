package com.aulasandroid.maior_ou_menor_de_idade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.maior_ou_menor_de_idade.ui.theme.GotuFont
import com.aulasandroid.maior_ou_menor_de_idade.ui.theme.Maior_ou_menor_de_idadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Maior_ou_menor_de_idadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IdadeScreen(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun IdadeScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Qual a sua idade?",
                modifier = Modifier
                    .fillMaxWidth(),
                fontFamily = GotuFont,
                color = Color(0, 123, 255, 255),
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold

            )

    }
}