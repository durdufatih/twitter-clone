package com.fatihdurdu.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fatihdurdu.twitter.R

@Composable
fun ProfileImage(showThread: Boolean, size: Float) {
    Surface {
        Image(
            painterResource(id = R.drawable.tweet_image),
            modifier = Modifier
                .clip(CircleShape)
                .padding(top = 5.dp, bottom = 5.dp)
                .size(52.dp),
            contentScale = ContentScale.Crop,
            contentDescription = "Main picture"
        )


    }
    if (showThread) {
        Divider(
            modifier = Modifier
                .width(1.dp)
                .height((size - 60).dp)

        )

    }
}
