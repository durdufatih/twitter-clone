package com.fatihdurdu.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.R
import com.fatihdurdu.twitter.utils.Colors

@Composable
fun ThreadComponent() {
    Row(
        modifier = Modifier.padding(start = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Surface {
            Image(
                painterResource(id = R.drawable.tweet_image),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(32.dp),
                contentScale = ContentScale.Crop,
                contentDescription = "Main picture"
            )


        }
        Text(
            text = "Show this thread",
            color = Colors.cardBlue,
            fontSize = 13.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}