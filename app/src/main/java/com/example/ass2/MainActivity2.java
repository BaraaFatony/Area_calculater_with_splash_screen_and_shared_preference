package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity implements selectlister {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item(R.drawable.a,"Learn"));
        items.add(new item(R.drawable.b,"Register"));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items , this));

    }

    @Override
    public void OnItemClick(int position) {
        if (position==0){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        }
        if (position==1){
            Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(intent);
        }
    }
}