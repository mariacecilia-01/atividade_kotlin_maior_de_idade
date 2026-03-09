package com.aulasandroid.maior_ou_menor_de_idade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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

    var idade by remember {
        mutableStateOf(0)
    }

    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Qual a sua idade?",
                modifier = Modifier
                    .fillMaxWidth(),
                fontFamily = GotuFont,
                color = Color(251, 121, 145, 255),
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Aperte os botões para informar a sua idade.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                fontFamily = GotuFont,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
            Text(text = "${idade}",
                modifier = Modifier
                    .fillMaxWidth(),
                fontFamily = GotuFont,
                color = Color(251, 121, 145, 255),
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
        Row(modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(26.dp)
        ) {
//            BOTAO SUBTRAIR
            Button(
                onClick = {
                    if (idade > 0){
                        idade--
                    }

            },
                modifier = Modifier
                    .height(65.dp)
                    .width(70.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(196, 208, 4, 255),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp)
                ) {
                Text(text = "-",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)
            }

//            BOTAO SOMAR
            Button(
                onClick = {
                    if (idade < 180){
                        idade++
                    }

            },
                modifier = Modifier
                    .height(65.dp)
                    .width(70.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(196, 208, 4, 255),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "+",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)
            }
        }

        if (idade >= 18){
            Text(text = "Você é MAIOR de idade",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(251, 121, 145, 255)
            )
            Image(
                painter = painterResource(R.drawable.lola),
                contentDescription = "Lola do Charlie e Lola"
            )
        }else{
            Text(text = "Você é MENOR de idade",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(251, 121, 145, 255)
            )
            Image(
                painter = painterResource(R.drawable.lola_gato),
                contentDescription = "Lola do Charlie e Lola com um gato"
            )
        }





    }
}