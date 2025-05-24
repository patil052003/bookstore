package com.vaishnavi.customerpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.vaishnavi.customerpage.ui.theme.CustomerPageTheme
import com.vaishnavi.customerpage.ui.theme.InfoCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomerPageTheme {
                InfoCard(
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CustomerPageTheme {
        InfoCard(

        )

    }
}