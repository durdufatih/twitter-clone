package com.fatihdurdu.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.utils.Colors

@Composable
fun ActionComponent(
    iconId: Int,
    personList: MutableList<String>
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 3.dp, start = 45.dp)
    ) {
        Image(
            painterResource(iconId),
            contentDescription = "Like",
            modifier = Modifier.size(12.dp),
        )
        Text(
            text = "${personList.first()} and ${personList.size - 1} like ",
            fontSize = 14.sp,
            color = Colors.cardGray,
            modifier = Modifier.padding(start = 2.dp)
        )
    }
}