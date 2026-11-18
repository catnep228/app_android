package com.example.test_for_is

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                content = { innerPadding: PaddingValues ->
                    Column(
                        modifier = Modifier.padding(innerPadding).fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        MainAppHeader()
                        Spacer(modifier = Modifier.height(30.dp))
                        MainNavButtons()
                    }
                }
            )

        }
    }
}

@Composable
fun MainAppHeader() {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Главная страница",
            fontSize = 28.sp)
        Text(text = "Пустая страница",
            fontSize = 16.sp)
        }//добавить что то, типо приветственной страницы
}

@Composable
fun MainNavButtons(){
    Row (modifier = Modifier.padding(horizontal = 0.3.dp)){
        Button(onClick = {},
            modifier = Modifier.weight(1f)){
            Text("Студенты")

        }
        Button(onClick = {},
            modifier = Modifier.weight(1f)){
            Text("База Вопросов")
        }
        Button(onClick = {},
            modifier = Modifier.weight(1f)){
            Text("Общая статистика")
        }
    }//в будущем заменить на нормальную навигационную панель
}

@Composable
@Preview(showBackground = true)
private fun MainAppHeaderPreview(){
    MainAppHeader()
}

@Composable
@Preview(showBackground = true)
fun MainNavButtonsPreview(){
    MainNavButtons()
}