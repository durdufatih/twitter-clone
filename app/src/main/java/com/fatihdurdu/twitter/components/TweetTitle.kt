package com.fatihdurdu.twitter.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TweetTitle(name: String, username: String, hour: String) {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(text = name, fontWeight = FontWeight.Bold)
        Text(text = username, color = Color(0xFF687684))
        Text(text = "·${hour}", color = Color(0xFF687684))
    }
}