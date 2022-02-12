package com.example.lessonfour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
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

public class LauncherCalculator extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_calculator);
        setListeners();
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case (R.id.buttonLauncher):
                Intent Intent = new Intent(android.content.Intent.ACTION_SENDTO);
                startActivity(Intent);

                break;
            default: {

            }
        }
    }

    private void setListeners() {
        ((MaterialButton) findViewById(R.id.buttonLauncher)).setOnClickListener(this);


    }
}