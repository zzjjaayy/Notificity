package com.darshan.notificity

import androidx.lifecycle.LiveData

class NotificationRepository(private val notificationDao: NotificationDao) {

    suspend fun insertNotification(notification: Notification){
        notificationDao.insertNotification(notification)
    }

    fun getAllNotifications() : LiveData<List<Notification>> = notificationDao.getAllNotifications()

}