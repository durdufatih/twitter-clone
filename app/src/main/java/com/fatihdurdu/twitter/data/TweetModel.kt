package com.fatihdurdu.twitter.data

data class TweetModel(
    val showThread: Boolean,
    val name: String,
    val username: String,
    val hour: String,
    val message: String,
    val hashTag: List<String>,
    val commentCount: String,
    val retweetCount: String,
    val likeCount: String,
    val showAction:Boolean
)
