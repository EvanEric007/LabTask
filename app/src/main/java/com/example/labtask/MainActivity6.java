package com.example.labtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity6 extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        initData();
        initRecyclerView();
        

    }

    private void initData() {
    userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.jahaz,"Basit", "10:45 am","How are you","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.monkey,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.burger,"Hamza", "10:20am","What are doing?","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.boss,"Ansa", "10:10 am","Where are you","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.doggy,"Talha", "10:04 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.frog,"Eva", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));
        userList.add(new ModelClass(R.drawable.foodie,"Hassan", "10:30 am","I am fine","____________________________________________" ));

    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager( this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}