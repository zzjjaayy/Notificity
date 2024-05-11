package com.darshan.notificity

import androidx.room.Entity

@Entity(primaryKeys = ["id", "packageName"])
data class NotificationEntity(
    val id: Int = 0,
    val packageName: String,
    val timestamp: Long,
    val appName: String,
    val title: String,
    val content: String,
    val imageUrl: String?, // Store image as bitmap
    val extras: String?
)
