package com.example.ursul.myfitnesschrono;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ursul on 17/02/2018.
 */

public class MyAlarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Alarm Recieved!", "YAAAY");
        Intent i = new Intent(context, InviteService.class);
        context.startService(i);
    }
}
