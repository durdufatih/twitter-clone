package com.fatihdurdu.twitter.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TweetCardTest(
    name: String,
    username: String,
    hour: String,
    showAction: Boolean,
    message: String,
    hashTag: String,
    commentCount: String,
    retweetCount: String,
    likeCount: String,
    iconId: Int,
    itemList: List<String>,
    showThread: Boolean,

    ) {


    val personList = itemList.toMutableList();
    Card(
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 4.dp)
            .fillMaxWidth(),
        elevation = 0.dp,
    ) {

        Column() {
            if (showAction) {
                ActionComponent(iconId, personList)
            }
            MainData(
                showThread,
                name,
                username,
                hour,
                message,
                hashTag,
                commentCount,
                retweetCount,
                likeCount
            )
            if (showThread) {
                ThreadComponent()
            }
        }


    }
}






