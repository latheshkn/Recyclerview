package com.example.recyclerhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerview);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<model> list =new ArrayList<>();

        list.add(new model("lathesh",R.drawable.ic_call_black));

        Adapter obj = new Adapter(list);
        recyclerView.setAdapter(obj);
    }
}
