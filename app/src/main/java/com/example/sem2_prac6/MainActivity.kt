package com.example.sem2_prac6

import android.app.ActivityManager
import android.app.LauncherActivity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var notificationManager:NotificationManager
    lateinit var builder:NotificationCompat.Builder
    var CHANNEL_ID ="123"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bm = applicationContext.getSystemService(BATTERY_SERVICE) as BatteryManager
        var batteryLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
        if(batteryLevel<70){
            Toast.makeText(this,"Your battery is below:-$batteryLevel please be aware" , Toast.LENGTH_LONG).show()
        }

//        notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//
//        var channel = NotificationChannel(CHANNEL_ID,"msg",NotificationManager.IMPORTANCE_HIGH)
//        notificationManager.createNotificationChannel(channel)

//        var intent = Intent(this@MainActivity,SmsReceiver::class.java).apply {
//            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//        }
//
//        var pandingIntent = PendingIntent.getBroadcast(this,1,intent,PendingIntent.FLAG_UPDATE_CURRENT)



    }
}




