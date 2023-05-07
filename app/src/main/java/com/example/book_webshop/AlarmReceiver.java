package com.example.book_webshop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        new NotificationHelper(context).send("It's time to get new books!");
    }
}
