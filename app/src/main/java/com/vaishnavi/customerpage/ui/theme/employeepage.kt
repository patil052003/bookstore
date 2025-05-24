package com.vaishnavi.customerpage.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoCard() {
    var name by remember { mutableStateOf("") }
    var time by remember { mutableStateOf("") }
    var mentor by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var Status by remember { mutableStateOf("") }
    var appointmentDate by remember { mutableStateOf("2025-23-04") }

    Column {
        Text(
            text = "Pool Route details",
            textAlign = TextAlign.Center,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)
                .padding(top = 18.dp)
        )
        Text(
            text = "Customer Details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
                .padding(top = 30.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFDDE2F4))
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Name: $name",
                    fontSize = 19.sp,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    color = Color.Black
                )
                Divider(
                    color = Color.DarkGray,
                    thickness = 2.dp
                )
                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "Address: $address",
                    fontSize = 19.sp,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                Divider(
                    color = Color.DarkGray,
                    thickness = 2.dp
                )
                Spacer(modifier = Modifier.height(25.dp))

//                Text(
//                    text = "Appointment Time: $time",
//                    fontSize = 19.sp,
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = Color.Black
//                )
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Appointment Time: $time",
                        fontSize = 19.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                    Text(
                        text = "$appointmentDate",
                        fontSize = 19.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                }
                Divider(
                    color = Color.DarkGray,
                    thickness = 2.dp
                )
                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "Assigned To: $mentor",
                    fontSize = 19.sp,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Service Details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
                .padding(top = 30.dp)
        )
        Card(
            modifier = Modifier
                .padding(18.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFDDE2F4))
        ) {
            Text(
                text = "Status: $Status",
                fontSize = 19.sp,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                color = Color.Black
            )
        }
    }
}