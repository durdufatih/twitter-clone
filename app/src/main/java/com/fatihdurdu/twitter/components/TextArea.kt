package com.fatihdurdu.twitter.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.utils.Colors

@Composable
fun TextArea(message: String, hashTag: String) {
    Column {
        Text(text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 16.sp
                )
            ) {
                append(message)
            }
            if (hashTag.isNotEmpty()) {
                withStyle(
                    style = SpanStyle(
                        color = Colors.cardBlue,
                        fontSize = 16.sp
                    )
                ) {
                    append("#$hashTag")

                }
            }
        }
        )
    }
}