package com.example.saravanan.firstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int CounterValue=0;
    TextView CounterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CounterTextView=(TextView)findViewById(R.id.CounterValueTextView);
    }

    public void increment(View view) {
       CounterValue++;
        CounterTextView.setText(String.valueOf(CounterValue));
    }
}
