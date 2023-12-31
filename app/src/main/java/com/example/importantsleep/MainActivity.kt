package com.example.importantsleep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.importantsleep.ui.theme.ImportantSleepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImportantSleepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Sleep()
                }
            }
        }
    }
}

@Composable
fun Sleep(modifier: Modifier = Modifier) {
    val imgHeader = painterResource(id = R.drawable.sleepheader)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = imgHeader,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
//                .height(210.dp)
//                .padding(5.dp)
        )
        Text(
            text = stringResource(R.string.header_text),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = stringResource(R.string.definition_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = stringResource(R.string.content_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImportantSleepTheme {
        Sleep()
    }
}