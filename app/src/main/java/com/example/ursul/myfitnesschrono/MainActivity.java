package com.example.ursul.myfitnesschrono;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Handler handler;
    private EditText intervalle;
    private EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.text);
        handler = new Handler(){
            public void handleMessage(android.os.Message message){
                if(message.what == 0){
                    tv.append("Intevalle terminé \n");
                }
            }
        };

        Intent alarmIntent = new Intent(this, MyAlarm.class);
        long scTime = 60* 1000;// 1 minute
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + scTime, pendingIntent);
    }

    public void backup(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                intervalle = findViewById(R.id.intervalle);
                number = findViewById(R.id.number);

                Integer nombre = new Integer(number.getText().toString());
                Long interv = new Long(number.getText().toString());

                for(int j = 0; j < nombre; j++){
                    for (int i = 0; i < interv; i++){
                        try{
                            Thread.sleep(10000);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    handler.sendEmptyMessage(0);
                }
            }
        }).start();
    }

    public void reset(View view){
        tv.setText("");
        intervalle.setText("");
        number.setText("");
    }
}
