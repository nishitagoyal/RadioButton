package com.example.goyal.drawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String name =intent.getStringExtra(homeActivity.NAME_KEY);
        String age = intent.getStringExtra(homeActivity.AGE);
        String Email= intent.getStringExtra(homeActivity.EMAIL);
        String gender= intent.getStringExtra(homeActivity.GENDER);

        TextView textView1 = findViewById(R.id.nameTextView);
        textView1.setText(name);

        TextView textView2 = findViewById(R.id.ageTextView);
        textView2.setText(age);

        TextView textView3 = findViewById(R.id.emailTextView);
        textView3.setText(Email);

      TextView textView4 = findViewById(R.id.genderTextView);
        textView4.setText(gender);

    }


}
