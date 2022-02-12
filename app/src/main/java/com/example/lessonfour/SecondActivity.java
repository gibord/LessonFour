package com.example.lessonfour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static String KEY_TWO = "Key_TWO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        setListeners();
    }

    private EditText textInputSecondActivity;
    private Button buttonMainActivity;

    private void setListeners() {
        ((MaterialButton) findViewById(R.id.buttonMainActivity)).setOnClickListener(this);

    }

    private void initView() {
        textInputSecondActivity = findViewById(R.id.textInputSecondActivity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textInputSecondActivity.setText(extras.getString(MainActivity.KEY_ONE));
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {

        switch (view.getId()) {
            case (R.id.buttonMainActivity): {
                Intent Intent = new Intent();
                Intent.putExtra(KEY_TWO, "Я сдесь!");
                SecondActivity.this.setResult(RESULT_OK, Intent);
                finish();
                break;
            }
            default: {


            }


        }

    }

}