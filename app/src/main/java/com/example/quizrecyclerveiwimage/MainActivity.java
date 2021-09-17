package com.example.quizrecyclerveiwimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quizrecyclerveiwimage.RecyclerView.RecyclerAdapter;
import com.example.quizrecyclerveiwimage.model.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
ArrayList<ModelClass> modelClassArrayList=new ArrayList<>();
modelClassArrayList.add(new ModelClass("Sam","Weekend adventure","Lets go fishing with john and others","10:42am"));
modelClassArrayList.add(new ModelClass("Facebook","James you have 1 new Notification","Alot has happened on facebook since","16:04pm"));
modelClassArrayList.add(new ModelClass("Google+", "Top suggested Google+ pages for you",
        "Top suggested Google+ pages for you",
        "18:44pm"));
modelClassArrayList.add(new ModelClass("Twitter", "Follow T-Mobile, Samsung Mobile U",
        "James, some people you may know",
        "20:04pm"));
modelClassArrayList.add(new ModelClass("Pinterest Weekly", "Pins you’ll love!",
        "Have you seen these Pins yet? Pinterest",
        "09:04am"));
modelClassArrayList.add(new ModelClass("Josh", "Going lunch", "Don't forget our lunch at 3PM in Pizza hut", "01:04am"));
modelClassArrayList.add(new ModelClass("Josh", "Going lunch", "Don't forget our lunch at 3PM in Pizza hut",
        "01:04am"));
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(modelClassArrayList);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(recyclerAdapter);

    }
}