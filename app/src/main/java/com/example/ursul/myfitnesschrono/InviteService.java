package com.example.ursul.myfitnesschrono;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by ursul on 17/02/2018.
 */

public class InviteService extends IntentService {

    /**
     * A constructor is required, and must call the super IntentService(String)
     * constructor with a name for the worker thread.
     */

    public InviteService() {
        super("InviteService");
    }

    /**
     * The IntentService calls this method from the default worker thread with
     * the intent that started the service. When this method returns, IntentService
     * stops the service, as appropriate.
     */

    @Override
    protected void onHandleIntent(Intent intent) {
//
//        String ns = Context.NOTIFICATION_SERVICE;
//        NotificationManager mNotificationManager = (NotificationManager) getSystemService(ns);
//
//        int icon = R.drawable.logo;
//        CharSequence tickerText = "New Invite!";
//        long when = System.currentTimeMillis();
//
//        Notification notification = new Notification(Parcelable.CONTENTS_FILE_DESCRIPTOR); //Notification(icon, tickerText, when);
//        notification.flags |= Notification.FLAG_AUTO_CANCEL;
//        notification.defaults |= Notification.DEFAULT_VIBRATE;
//
//        Context context = getApplicationContext();
//        CharSequence contentTitle = "Title";
//        CharSequence contentText = "Text";
//        Intent notificationIntent = new Intent(this, Destination.class);
//        Bundle partyBundle = new Bundle();
//
//        PendingIntent contentIntent = PendingIntent.getActivity(this, SOME_ID, notificationIntent, 0);
//
//        notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
//
//        int NOTIFICATION_ID = SOME_ID;
//
//        Log.d("NOTIFICATION_ID", "" + NOTIFICATION_ID);
//        mNotificationManager.notify(NOTIFICATION_ID, notification);
//
//        Intent alarmIntent = new Intent(this, MyAlarm.class);
//        long scTime = 60*1000;//mins
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0);
//        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + scTime, pendingIntent);
//
//        stopService(intent);
    }
}
