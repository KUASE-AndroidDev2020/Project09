package com.example.project09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;


public class Main2Activity extends AppCompatActivity  implements OnDateChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(this);
    }

    public void onSelectedDayChange(CalendarView view, int year, int month,
                                    int dayOfMonth) {

        Intent varIntent = new Intent(this, calendar.class);

        startActivity(varIntent);

    }


}
