package com.example.staggeredgridrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView staggeredRecyclerView;
    private Adapter adapter;
    private StaggeredGridLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        staggeredRecyclerView = findViewById(R.id.staggeredRV);
        manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        staggeredRecyclerView.setLayoutManager(manager);

        List<row> list = new ArrayList<>();

        list.add(new row(R.drawable.one));
        list.add(new row(R.drawable.two));
        list.add(new row(R.drawable.three));
        list.add(new row(R.drawable.four));
        list.add(new row(R.drawable.five));
        list.add(new row(R.drawable.six));
        list.add(new row(R.drawable.seven));
        list.add(new row(R.drawable.eight));
        list.add(new row(R.drawable.nine));
        list.add(new row(R.drawable.ten));
        list.add(new row(R.drawable.eleven));
        list.add(new row(R.drawable.twelve));
        list.add(new row(R.drawable.one));
        list.add(new row(R.drawable.two));

        adapter = new Adapter(this,list);
        staggeredRecyclerView.setAdapter(adapter);
    }
}
