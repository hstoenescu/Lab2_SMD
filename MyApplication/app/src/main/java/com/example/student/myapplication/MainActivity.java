package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = (Button) findViewById(R.id.button);
        final EditText myEditText = (EditText) findViewById(R.id.textView);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondaryActivity.class);
                String myText = myEditText.getText().toString();
                myIntent.putExtra("MSG", myText);
                startActivity(myIntent);
            }
        });
    }
}
