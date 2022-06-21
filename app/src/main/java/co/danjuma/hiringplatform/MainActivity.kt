package co.danjuma.hiringplatform


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(

            Font(R.font.montserrat_extrabold, FontWeight.Bold),
            Font(R.font.montserrat_black, FontWeight.Black),
            Font(R.font.montserrat_regular, FontWeight.Normal),
            Font(R.font.montserrat_medium, FontWeight.Medium),
            Font(R.font.montserrat_semibold, FontWeight.SemiBold)
        )


        setContent {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(35.dp)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Text(
                        text = "Find your",
                        fontSize = 40.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Black
                    )

                    Text(
                        text = "dream jobs",
                        fontSize = 40.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.drawBehind {

                            val canvasWidth = size.width

                            Log.i("Canvas Width", canvasWidth.toString())


                            drawLine(
                                start = Offset(x = canvasWidth, y = 140.0f),
                                end = Offset(x = 0f, y = 140f),
                                color = Color(0xFF0cab7a),
                                strokeWidth = 17F
                            )
                        }


                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "Discover 876 open positions",
                        fontSize = 17.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF858891)
                    )



                    Box(
                        modifier = Modifier.padding(top = 50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.main_background),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillWidth
                        )

                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "Are you looking for:",
                        fontSize = 15.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF858891),

                        )

                    Spacer(modifier = Modifier.height(20.dp))


                    Button(
                        onClick = { /*TODO*/ }, modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp), shape = RoundedCornerShape(15.dp)
                    ) {

                        Row(horizontalArrangement = Arrangement.SpaceEvenly) {

                            Image(
                                painterResource(id = R.drawable.suitcase),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(28.dp)
                                    .weight(0.1f),
                                colorFilter = ColorFilter.tint(Color.White)
                            )



                            Text(
                                text = "A design job",
                                modifier = Modifier.weight(0.1f).align(CenterVertically)
                            )

                            Icon(
                                Icons.Filled.Check,
                                contentDescription = null,
                                modifier = Modifier.weight(0.1f)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedButton(
                        onClick = { /*TODO*/ }, modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                    ) {
                        Row(horizontalArrangement = Arrangement.SpaceEvenly) {

                            Image(
                                painterResource(id = R.drawable.suitcase),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(29.dp)
                                    .weight(0.2f)
                            )



                            Text(
                                text = "A design job",
                                modifier = Modifier.weight(0.3f)
                            )


                        }
                    }


                }

            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun TextFunction() {


}


