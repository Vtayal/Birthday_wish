package com.example.hp.birhtday_wish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
static String from1,to1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText from=(EditText)findViewById(R.id.editText);
        final EditText to=(EditText)findViewById(R.id.editText2);
        Button createcard=(Button)findViewById(R.id.button);
        createcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                from1=from.getText().toString();
                to1=to.getText().toString();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
