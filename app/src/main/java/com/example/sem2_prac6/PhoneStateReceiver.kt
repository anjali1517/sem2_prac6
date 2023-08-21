package com.example.sem2_prac6

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.os.Bundle
import android.telecom.TelecomManager
import android.telephony.SmsMessage
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast

class PhoneStateReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        try {
           // println("Receiver starter")
            //Toast.makeText(context, "receiver start", Toast.LENGTH_LONG).show()
            //Log.i("Anjali", "Receiver start")

            var state: String? = intent?.getStringExtra(TelephonyManager.EXTRA_STATE)
            var incomingNumber = intent?.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)

            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                Toast.makeText(context, "call ringing", Toast.LENGTH_LONG).show()
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                Toast.makeText(context, "called received state", Toast.LENGTH_LONG).show()
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                Toast.makeText(context, "call idle state", Toast.LENGTH_LONG).show()
            }

            (state.equals(TelephonyManager.EXTRA_INCOMING_NUMBER))
                Toast.makeText(context, "ringing number is:-$incomingNumber",Toast.LENGTH_LONG).show()


//            val bundle = intent?.extras
//            val pduObj = arrayOf(bundle?.get("pdus"))
//            for (i in pduObj.iterator()) {
//                var message = SmsMessage.createFromPdu(i as ByteArray?)
//                var mobileNo = message.displayOriginatingAddress
//                var msg = message.displayMessageBody
//                Toast.makeText(context, " $mobileNo\n$msg ", Toast.LENGTH_LONG).show()
//                Log.i("Anjali","$mobileNo \n $msg")
//            }
        }
        catch (e:Exception){
                e.printStackTrace()
        }


    }

}