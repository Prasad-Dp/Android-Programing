package com.example.grapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class BarChat extends AppCompatActivity {
    BarChart bc;
    ArrayList<BarEntry> entries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chat);
        bc=findViewById(R.id.bc);
        entries=new ArrayList<>();
        entries.add(new BarEntry(2005,1));
        entries.add(new BarEntry(2006,2));
        entries.add(new BarEntry(2007,3));
        entries.add(new BarEntry(2006,4));
        entries.add(new BarEntry(2007,5));

        BarDataSet dataSet=new BarDataSet(entries,"Student");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextSize(15);
        dataSet.setValueTextColor(Color.RED);

        BarData data=new BarData(dataSet);
        bc.setData(data);
    }
}