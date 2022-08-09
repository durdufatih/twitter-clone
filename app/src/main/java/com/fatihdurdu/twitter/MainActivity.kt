package com.fatihdurdu.twitter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.twitter.components.TweetCardTest
import com.fatihdurdu.twitter.data.DataList
import com.fatihdurdu.twitter.ui.theme.TwitterTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val itemList = listOf("Fatih Durdu", "Handenur Durdu")
                    val itemsOfTweet = DataList.dataList.toMutableList()
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()

                    Scaffold(
                        scaffoldState = scaffoldState,
                        topBar = {
                            Greeting(scaffoldState, scope)
                        },
                        content = {
                            Column {
                                Divider(color = Color.LightGray, thickness = (0.5.dp))
                                LazyColumn() {
                                    items(items = itemsOfTweet, itemContent = {
                                        TweetCardTest(
                                            name = it.name,
                                            username = it.username,
                                            hour = it.hour,
                                            message = it.message,
                                            hashTag = it.hashTag.joinToString(" "),
                                            commentCount = it.commentCount,
                                            retweetCount = it.retweetCount,
                                            likeCount = it.likeCount,
                                            showAction = it.showAction,
                                            iconId = R.drawable.heart_solid,
                                            itemList = itemList,
                                            showThread = it.showThread
                                        )
                                        Divider(color = Color.LightGray, thickness = (0.5.dp))
                                    })
                                }
                            }
                        },
                        floatingActionButton = {
                            FloatingActionButton(
                                modifier = Modifier.padding(bottom = 20.dp),
                                onClick = {},
                                backgroundColor = Color.Transparent,
                                contentColor = Color.Transparent
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.add_text),
                                    contentDescription = "Add icon",
                                    modifier = Modifier.size(66.dp)

                                )
                            }
                        },
                        drawerContent = {
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(text = "Under The Constructor", fontSize = 18.sp)
                            }
                        },
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(state: ScaffoldState, scope: CoroutineScope) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 5.dp)
            .height(50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AccountDetail(state, scope)
    }

}


@Composable
fun AccountDetail(state: ScaffoldState, scope: CoroutineScope) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface {
            Image(
                painterResource(id = R.drawable.round),
                modifier = Modifier
                    .clickable(onClick = {
                        scope.launch { if (state.drawerState.isClosed) state.drawerState.open() else state.drawerState.close() }
                    })
                    .clip(CircleShape)
                    .size(32.dp),
                contentScale = ContentScale.Crop,
                contentDescription = "Main picture"
            )

        }
        Surface {
            Image(
                painterResource(id = R.drawable.twitter),
                modifier = Modifier
                    .width(27.dp)
                    .height(22.dp),
                contentDescription = "Twitter Icon"
            )

        }
        Surface {
            Image(
                painterResource(id = R.drawable.feature),
                modifier = Modifier
                    .width((22.64).dp)
                    .height((21.75).dp),
                contentDescription = "New Feature Icon"
            )

        }


    }


}
