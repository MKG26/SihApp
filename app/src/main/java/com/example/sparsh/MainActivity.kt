package com.example.sparsh

import android.hardware.ConsumerIrManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.SparshTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SparshTheme {
                // A surface container using the 'background' color from the theme

                    frontApp()

            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun frontApp(
    modifier: Modifier = Modifier
) {




        Column(

            modifier = modifier



        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(200.dp)
            )

            Text(
                text = "Login As",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 50.dp)
            )


            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(bottom = 90.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center


            ) {
                layout(
                    image = R.drawable.railway,
                    who = R.string.railway,

                    )

                layout(
                    image = R.drawable.coal,
                    who = R.string.coal,

                    )
            }
        }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun layout(
    modifier: Modifier = Modifier,
     image: Int,
    who : Int

){

    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .padding(20.dp),
        onClick = {}
    ) {
        Column(
            modifier = modifier
                .padding(20.dp)
        ) {



            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(width = 130.dp, height = 130.dp)
                    .clip(MaterialTheme.shapes.small)
                    .padding(bottom = 10.dp)
            )

            Text(

                text = stringResource(id = who),
                modifier = modifier

                    .align(alignment = Alignment.CenterHorizontally),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold


            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SparshTheme {
        frontApp()
    }
}

