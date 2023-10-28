package com.example.sparsh
import com.example.compose.SparshTheme
//package com.example.sparsh.ui.theme.SparshTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sparsh.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun secondLogInPage() {

    var loginId by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    var name by remember{ mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = {sparshTopBar(modifier = Modifier) })

        },
        content = {
                innerPadding ->
            val modifier = Modifier.padding(innerPadding)
            Column(modifier = modifier
                .fillMaxWidth()
                .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = stringResource(id = R.string.login),
                    modifier = Modifier
                        .padding(top=25.dp, start = 25.dp,end=25.dp, bottom = 50.dp),
                    style = MaterialTheme.typography.displayMedium,
                    color = Color.Blue
                )

                EditField(
                    label = R.string.name,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    ),
                    value = name,
                    onValueChanged = {name = it},
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth(),
                )

                EditField(
                    label = R.string.id,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    ),
                    value = loginId,
                    onValueChanged = {loginId = it},
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth(),
                )
                EditField(
                    label = R.string.password,

                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    value = password,
                    onValueChanged = {password = it},
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth(),
                )

                Button(
                    shape = RoundedCornerShape(15.dp),
                    onClick = {},
                ){
                    Text(text = stringResource(id = R.string.btnLogin))
                }

            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun sparshTopBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(top = 55.dp)
                    .clip(RoundedCornerShape(50.dp)),
            )
        })
}



@ExperimentalMaterial3Api
@Composable
fun EditField(
    label: Int,
    keyboardOptions: KeyboardOptions,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    value: String,
){
    TextField(
        value = value,

        onValueChange = onValueChanged,
        label = {Text(stringResource(label))},
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        singleLine = true,
    )
}

@Preview(showBackground = true)
@Composable
fun secondLogin() {
    SparshTheme {
        secondLogInPage()
    }
}