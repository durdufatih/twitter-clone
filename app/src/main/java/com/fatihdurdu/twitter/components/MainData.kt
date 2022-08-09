package com.fatihdurdu.twitter.components

import android.content.res.Resources
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp

@Composable
fun MainData(
    showThread: Boolean,
    name: String,
    username: String,
    hour: String,
    message: String,
    hashTag: String,
    commentCount: String,
    retweetCount: String,
    likeCount: String
) {
    var size by remember { mutableStateOf(0F) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .height(IntrinsicSize.Min)
            .onSizeChanged {
                if (size == 0F) {
                    size =
                        it.height.toFloat() / Resources.getSystem().displayMetrics.density
                    Log.d("SIZE-2", "Item Size:${size}")
                }
            }
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Log.d("SIZE-3", "Item Size1:${size}")
            ProfileImage(showThread, size)
        }
        Column(modifier = Modifier.padding(start = 10.dp)) {
            TweetTitle(name, username, hour)
            TextArea(message, hashTag)
            ActionButtons(commentCount, retweetCount, likeCount)

        }
    }
}





