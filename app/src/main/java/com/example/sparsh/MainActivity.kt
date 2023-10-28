package com.example.sparsh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

                    .fillMaxWidth()
                    .padding(top = 30.dp),
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
            
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
                
                    
            ){
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 10.dp),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Login")
                }

                Spacer(modifier = Modifier.width(120.dp))
                
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 10.dp),
                    shape = RoundedCornerShape(10.dp)

                ) {
                   Text(text = "Login")
                }
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
            )

            Text(

                text = stringResource(id = who),
                modifier = modifier
                    .padding(top = 10.dp)
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

