package com.shubham.augumentedrealityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sdsmdg.tastytoast.TastyToast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.bottom_sheet);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bottomSheetDialog =  new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);
                View sheetview = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheet,null);
                sheetview.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TastyToast.makeText(MainActivity.this, "Share Button Clicked..", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
                    }
                });

                sheetview.findViewById(R.id.location).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TastyToast.makeText(MainActivity.this, "Location Button Clicked..", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
                    }
                });

                bottomSheetDialog.setContentView(sheetview);
                bottomSheetDialog.show();

            }
        });

    }
}