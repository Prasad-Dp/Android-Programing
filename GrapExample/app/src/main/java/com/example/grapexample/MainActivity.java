package com.example.grapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bar(View view) {
        Intent intent=new Intent(MainActivity.this,BarChat.class);
        startActivity(intent);
    }

    public void Pie(View view) {
        startActivity(new Intent(this, PieChat.class));
    }

    public void Line(View view) {
        startActivity(new Intent(this, LineChat.class));
    }
}