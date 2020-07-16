package com.example.project09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ((CalendarView) findViewById(R.id.calendarView)).setOnDateChangeListener(listener);
    }
    CalendarView.OnDateChangeListener listener = new CalendarView.OnDateChangeListener() {

        /**
         * 日付部分タップ時に実行される処理
         * @param view 押下されたカレンダーのインスタンス
         * @param year タップされた日付の「年」
         * @param month タップされた日付の「月」※月は0月から始まるから、+1して調整が必要
         * @param dayOfMonth タップされた日付の「日」
         */
        public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
            // とりあえずトースト表示してみる
            Toast.makeText(getApplicationContext(), year + "年" + (month + 1) + "月" + dayOfMonth + "日がクリックされました", Toast.LENGTH_SHORT).show();

            // メモ画面へ遷移するIntent発行？
            Intent calendar = new Intent(this,calendar.class);
            startActivity(calendar);
        }
}
