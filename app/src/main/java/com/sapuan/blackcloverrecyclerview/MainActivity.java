package com.sapuan.blackcloverrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<BlackClover> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(BlackCloverData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBlackCloverAdapter listBlackCloverAdapter = new ListBlackCloverAdapter(this);
        listBlackCloverAdapter.setListBlackClover(list);
        rvCategory.setAdapter(listBlackCloverAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent detailActivity = new Intent(MainActivity.this, DetailActivity.class);
                detailActivity.putExtra("KIRIM", list.get(position));
                startActivity(detailActivity);
            }
        });
    }
}
