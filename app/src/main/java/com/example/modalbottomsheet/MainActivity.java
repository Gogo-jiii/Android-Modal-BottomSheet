package com.example.modalbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnShowModalBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowModalBottomSheet = findViewById(R.id.btnShowModalBottomSheet);
        btnShowModalBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                ModalBottomSheetFragment modalBottomSheetFragment = new ModalBottomSheetFragment();
                modalBottomSheetFragment.show(getSupportFragmentManager(), "Modal BottomSheet");
            }
        });
    }
}