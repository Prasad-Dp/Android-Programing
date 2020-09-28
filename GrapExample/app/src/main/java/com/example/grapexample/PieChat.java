package com.example.grapexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.grapexample.databinding.ActivityPieChatBinding;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class PieChat extends AppCompatActivity {
    PieChart pc;
    ArrayList<PieEntry>entries;
    ActivityPieChatBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_pie_chat);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pie_chat);
        pc=findViewById(R.id.pc);
        entries=new ArrayList<>();
    }

    public void Piechart(View view) {
        float e1 = Float.parseFloat(binding.v1.getText().toString());
        float e2 = Float.parseFloat(binding.v2.getText().toString());
        float e3 = Float.parseFloat(binding.v3.getText().toString());
        float e4 = Float.parseFloat(binding.v5.getText().toString());
        float e5 = Float.parseFloat(binding.v5.getText().toString());
        entries.add(new PieEntry(e1,"2015"));
        entries.add(new PieEntry(e2,"2016"));
        entries.add(new PieEntry(e3,"2017"));
        entries.add(new PieEntry(e4,"2018"));
        entries.add(new PieEntry(e5,"2019"));

        PieDataSet dataSet=new PieDataSet(entries,"Student");
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
        dataSet.setValueTextSize(15);
        dataSet.setValueTextColor(Color.RED);

        PieData data=new PieData(dataSet);
        pc.setData(data);
        binding.v1.setText("");
        binding.v2.setText("");
        binding.v3.setText("");
        binding.v4.setText("");binding.v5.setText("");

    }
}