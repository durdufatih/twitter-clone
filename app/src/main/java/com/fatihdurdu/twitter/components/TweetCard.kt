package com.fatihdurdu.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.R
import com.fatihdurdu.twitter.utils.Colors


@Preview
@Composable
fun TweetCard() {

    Card(
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(start = 25.dp, top = 5.dp, end = 10.dp, bottom = 4.dp)
            .fillMaxWidth(),
        elevation = 0.dp,
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Row(modifier = Modifier.padding(top = 5.dp)) {
                Surface {

                    Image(
                        painterResource(id = R.drawable.tweet_image),
                        modifier = Modifier
                            .clip(CircleShape)
                            .padding(top = 5.dp)
                            .size(52.dp),
                        contentScale = ContentScale.Crop,
                        contentDescription = "Main picture"
                    )


                }
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(text = "Martha Craig", fontWeight = FontWeight.Bold)
                        Text(text = "@craig_love", color = Color(0xFF687684))
                        Text(text = "·12h", color = Color(0xFF687684))
                    }
                    Column {
                        Text(text = buildAnnotatedString {
                            append("UXR/UX: You can only bring one item to a remote island to assist your research of native use of tools and usability. What do you bring?")
                            withStyle(
                                style = SpanStyle(
                                    color = Colors.cardBlue,
                                    fontSize = 13.sp
                                )
                            ) {
                                append("#TellMeAboutYou")
                            }
                        }
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.7f)
                            .padding(top = 5.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(id = R.drawable.comment),
                                contentDescription = "Comment",
                                modifier = Modifier.size(12.dp),
                            )
                            Text(
                                text = "28",
                                fontSize = 10.sp,
                                color = Colors.cardGray,
                                modifier = Modifier.padding(1.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(id = R.drawable.retweet),
                                contentDescription = "Retweet",
                                modifier = Modifier.size(12.dp),
                            )
                            Text(
                                text = "5",
                                fontSize = 10.sp,
                                color = Colors.cardGray,
                                modifier = Modifier.padding(1.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(id = R.drawable.heart),
                                contentDescription = "Comment",
                                modifier = Modifier.size(12.dp),
                            )
                            Text(
                                text = "21",
                                fontSize = 10.sp,
                                color = Colors.cardGray,
                                modifier = Modifier.padding(1.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(id = R.drawable.share),
                                contentDescription = "Share",
                                modifier = Modifier.size(11.dp),
                            )

                        }
                    }

                }
            }
            Divider(modifier = Modifier.height(100.dp).width(1.dp), color = Colors.cardBlue)
            Row(
                modifier = Modifier.padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Surface {

                    Image(
                        painterResource(id = R.drawable.tweet_image),
                        modifier = Modifier
                            .clip(CircleShape)
                            .padding(top = 5.dp)
                            .size(32.dp),
                        contentScale = ContentScale.Crop,
                        contentDescription = "Main picture"
                    )


                }
                Text(
                    text = "Show this thread",
                    color = Colors.cardBlue,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }


    }
}