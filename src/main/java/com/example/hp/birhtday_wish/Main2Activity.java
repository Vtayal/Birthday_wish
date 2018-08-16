package com.example.hp.birhtday_wish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView from=(TextView)findViewById(R.id.from);
        TextView to=(TextView)findViewById(R.id.to);
        from.setText("From : "+MainActivity.from1);
        to.setText("To : "+MainActivity.to1);
    }
}
