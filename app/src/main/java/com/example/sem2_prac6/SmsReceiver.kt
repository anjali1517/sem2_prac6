package com.example.sem2_prac6

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsMessage
import android.widget.Toast
import androidx.core.app.NotificationCompat
import java.util.Objects

class SmsReceiver:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val bundle = intent?.extras
        val pduObj = arrayOf( bundle?.get("pdus"))
         for(i in pduObj.iterator()){
                var message = SmsMessage.createFromPdu(i as ByteArray?)
             var mobileNo = message.displayOriginatingAddress
             var msg = message.displayMessageBody
            Toast.makeText(context, " $mobileNo\n$msg ",Toast.LENGTH_LONG).show()

//             var builder = context?.let { NotificationCompat.Builder(it) }
//             if (builder != null) {
//                 builder.setContentTitle(mobileNo)
//                 builder.setContentText(msg)
//             }
//             var notificationManager:NotificationManager = context?.getSystemService(
//                 NOTIFICATION_SERVICE) as NotificationManager
//             if (builder != null) {
//                 notificationManager.notify(1,builder.build())
//             }

         }

        }

    }
