package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        final TextView myTextView = (TextView) findViewById(R.id.textView2);

        Intent myNewCls = getIntent();
        if ( myNewCls != null ) {
            // we know the key - MSG
            String myMsg = myNewCls.getExtras().getString("MSG");
            myTextView.setText(myMsg);
        }
    }
}
