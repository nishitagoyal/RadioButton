package com.example.goyal.drawable;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class homeActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
   RadioGroup radioGroup;
    RadioButton radioButton;
    //RadioButton radioButton2;
    public static final String NAME_KEY = "student_name";
    public static final String EMAIL = "student_EMAIL";
    public static final String AGE = "student_AGE";
    public static final String GENDER = "student_GENDER";
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        editText1=findViewById(R.id.edittext1);
        editText2=findViewById(R.id.edittext2);
        editText3=findViewById(R.id.edittext3);
        radioGroup = findViewById(R.id.radio);
        sharedPreferences=getSharedPreferences("mysharedprefer",MODE_PRIVATE);
        String name1=sharedPreferences.getString(NAME_KEY,null);
        if(name1!=null)
            editText1.setText(name1);
        String name2=sharedPreferences.getString(AGE,null);
        if(name2!=null)
            editText2.setText(name2);
        String name3=sharedPreferences.getString(EMAIL,null);
        if(name3!=null)
            editText3.setText(name3);
//        String name4=sharedPreferences.getString(GENDER,null);
//       if(name4!=null)
//            radioGroup.(name4);
//            radioGroup.get

        // radioButton1=findViewById(R.id.male);
        //radioButton2=findViewById(R.id.female);
    }
    public void startMainActivity(View view){
        String name = editText1.getText().toString();
        String age = editText2.getText().toString();
        String EMaiL = editText3.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(NAME_KEY,name);
        intent.putExtra(AGE,age);
        intent.putExtra(EMAIL,EMaiL);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        String gender = radioButton.getText().toString();
        intent.putExtra(GENDER,gender);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(NAME_KEY,name);
        editor.putString(EMAIL,EMaiL);
        editor.putString(AGE,age);
        editor.commit();
        //editor.putString(GENDER,gender);
        startActivity(intent);

    }
}
