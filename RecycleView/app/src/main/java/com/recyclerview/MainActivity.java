package com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.recyclerview.adapter.RecyclerViewAdapter;
import com.recyclerview.data.MyData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        ArrayList<MyData> data=new ArrayList<>();
        data.add(new MyData("Dinesh","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("Sugam","Kirtipur",R.mipmap.ic_launcher));
        data.add(new MyData("Sangam","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("Nayan","Kirtipur",R.mipmap.ic_launcher));
        data.add(new MyData("prachanda","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("xitiz","Kirtipur",R.mipmap.ic_launcher));
        data.add(new MyData("Ratnesh","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("Cigar","Kirtipur",R.mipmap.ic_launcher));
        data.add(new MyData("Crush","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("Nynnyn","Kirtipur",R.mipmap.ic_launcher));
        data.add(new MyData("Dallo","Kathmandu",R.mipmap.ic_launcher));
        data.add(new MyData("Dinesh","Kirtipur",R.mipmap.ic_launcher));

        layoutManager=new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    adapter=new RecyclerViewAdapter(this,data);
    recyclerView.setAdapter(adapter);
    }
}