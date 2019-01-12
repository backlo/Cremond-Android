package com.example.lenovo.cremond_android;

import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.cremond_android.Animal.AnimalActivity;
import com.example.lenovo.cremond_android.Body.BodyActivity;
import com.example.lenovo.cremond_android.Color.ColorActivity;
import com.example.lenovo.cremond_android.Job.JobActivity;
import com.example.lenovo.cremond_android.Number.NumberActivity;
import com.example.lenovo.cremond_android.Objects.ObjectsActivity;
import com.example.lenovo.cremond_android.Plant.PlantActivity;
import com.example.lenovo.cremond_android.Vehicle.VehicleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.animal_image) ImageView animal_image;
    @BindView(R.id.animal_text) TextView animal_text;
    @BindView(R.id.body_image) ImageView body_image;
    @BindView(R.id.body_text) TextView body_text;
    @BindView(R.id.color_image) ImageView color_image;
    @BindView(R.id.color_text) TextView color_text;
    @BindView(R.id.job_image) ImageView job_image;
    @BindView(R.id.job_text) TextView job_text;
    @BindView(R.id.number_image) ImageView number_image;
    @BindView(R.id.number_text) TextView number_text;
    @BindView(R.id.objects_image) ImageView objects_image;
    @BindView(R.id.objects_text) TextView objects_text;
    @BindView(R.id.plant_image) ImageView plant_image;
    @BindView(R.id.plant_text) TextView plant_text;
    @BindView(R.id.vehicle_image) ImageView vehicle_image;
    @BindView(R.id.vehicle_text) TextView vehicle_text;

    private static final long MIN_CLICK_INTEVAL = 600;
    private long mLastClickTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.animal_text, R.id.animal_image})
    public void animalOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, AnimalActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.body_text, R.id.body_image})
    public void bodyOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, BodyActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.color_text, R.id.color_image})
    public void colorOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, ColorActivity.class);
        startActivity(i);

    }

    @OnClick({R.id.job_text, R.id.job_image})
    public void jobOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, JobActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.number_text, R.id.number_image})
    public void numberOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, NumberActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.objects_text, R.id.objects_image})
    public void objectsOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, ObjectsActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.plant_text, R.id.plant_image})
    public void plantOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, PlantActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.vehicle_text, R.id.vehicle_image})
    public void vehicleOnClick(){
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        if(elapsedTime <= MIN_CLICK_INTEVAL) return;

        Intent i = new Intent(MainActivity.this, VehicleActivity.class);
        startActivity(i);
    }

}