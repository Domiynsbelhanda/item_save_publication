package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_article);

        categorySpinnerConfig();
        imageView();
        sizeSpinnerConfig();
    }

    void categorySpinnerConfig(){
        Spinner categorySpinner = (Spinner) findViewById(R.id.save_input_category);
        categorySpinner.setBackgroundColor(getResources().getColor(R.color.white));
        //Adapter for select
        ArrayAdapter<CharSequence> categoryAdapter =
                ArrayAdapter
                        .createFromResource(this, R.array.save_list_category, android.R.layout.simple_spinner_item);
        categoryAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(categoryAdapter);
    }

    void imageView(){
        ImageView imageView = (ImageView) findViewById(R.id.save_image);
        imageView.setImageResource(R.drawable.virgil_abloh_nike);
    }

    void sizeSpinnerConfig(){
        Spinner sizeSpinner = (Spinner) findViewById(R.id.save_input_size);
        sizeSpinner.setBackgroundColor(getResources().getColor(R.color.white));
        //Adapter for select
        ArrayAdapter<CharSequence> sizeAdapter =
                ArrayAdapter
                        .createFromResource(this, R.array.save_list_size, android.R.layout.simple_spinner_item);
        sizeAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSpinner.setAdapter(sizeAdapter);
    }
}