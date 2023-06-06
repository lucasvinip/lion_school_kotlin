package br.senai.sp.jandira.lionschool.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.ui.theme.ui.theme.LionSchoolTheme

class StudentsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                StudentsScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StudentsScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(
                        bottomStart = 80.dp, bottomEnd = 80.dp,
                    ),
                    backgroundColor = Color(51, 71, 176)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "",
                            alignment = Alignment.Center
                        )
                        Text(
                            text = stringResource(id = R.string.nets),
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(30.dp)
                        .width(100.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            backgroundColor = Color.White,
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Blue
                    )
                ){
                    Text(
                        text = stringResource(id = R.string.all),
                        fontSize = 12.sp
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(30.dp)
                        .width(100.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            backgroundColor = Color.White,
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Blue
                    )
                ){
                    Text(
                        text = stringResource(id = R.string.studying),
                        fontSize = 12.sp
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(30.dp)
                        .width(100.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            backgroundColor = Color.White,
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.Blue
                    )
                ){
                    Text(
                        text = stringResource(id = R.string.finished),
                        fontSize = 12.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(Color(51, 71, 176))
            ) {

            }
            LazyColumn() {

            }
        } // primeira column
    } // surface
} // StudentsScreen