package com.fatihdurdu.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.R
import com.fatihdurdu.twitter.utils.Colors

@Composable
fun ActionButtons(
    commentCount: String,
    retweetCount: String,
    likeCount: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .padding(top = 5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.comment),
                contentDescription = "Comment",
                modifier = Modifier.size(12.dp),
            )
            if (commentCount != "0") {
                Text(
                    text = commentCount,
                    fontSize = 10.sp,
                    color = Colors.cardGray,
                    modifier = Modifier.padding(1.dp)
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.retweet),
                contentDescription = "Retweet",
                modifier = Modifier.size(12.dp),
            )
            if (retweetCount != "0") {
                Text(
                    text = retweetCount,
                    fontSize = 10.sp,
                    color = Colors.cardGray,
                    modifier = Modifier.padding(1.dp)
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.heart),
                contentDescription = "Comment",
                modifier = Modifier.size(12.dp),
            )
            if (likeCount != "0") {
                Text(
                    text = likeCount,
                    fontSize = 10.sp,
                    color = Colors.cardGray,
                    modifier = Modifier.padding(1.dp)
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.share),
                contentDescription = "Share",
                modifier = Modifier.size(11.dp),
            )

        }
    }
}