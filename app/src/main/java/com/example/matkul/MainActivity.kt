package com.example.matkul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.matkul.data.Datasource
import com.example.matkul.model.Matkul
import com.example.matkul.ui.theme.MatkulTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatkulTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MatkulApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MatkulTheme {
        MatkulApp()
    }
}
@Composable
fun MatkulApp(){
    ListMatkul(Datasource().load_matkul(), Modifier = Modifier)
}

@Composable
fun ListMatkul(list_matkul: List<Matkul>, Modifier: Modifier){
    LazyColumn(modifier = Modifier){
        items(list_matkul){matkul ->
            DisplayMatkul(matkul, Modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp))
        }
    }
}

@Composable
fun DisplayMatkul(matkul: Matkul, Modifier: Modifier){
    Card(
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
    ){
        Row {
            Image(
                painter = painterResource(id = matkul.imageResourceId),
                contentDescription = stringResource(id = matkul.stringResourceId),
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text =  stringResource(id = matkul.stringResourceId),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                )
                Text(
                    text = "SKS: " + stringResource(id = matkul.stringResourceId2),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                )
            }
        }
    }
}