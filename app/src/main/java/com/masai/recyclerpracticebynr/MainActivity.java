package com.masai.recyclerpracticebynr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.masai.recyclerpracticebynr.adapters.Adapter1;
import com.masai.recyclerpracticebynr.classes.RecyclerItemClickListener;
import com.masai.recyclerpracticebynr.models.model1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<model1> list =new ArrayList();
        list.add(new model1(R.drawable.indian_food0,"1"));
        list.add(new model1(R.drawable.indian_food9,"2"));
        list.add(new model1(R.drawable.indian_food2,"3"));
        list.add(new model1(R.drawable.indian_food_3,"4"));
        list.add(new model1(R.drawable.indian_food4,"5"));
        list.add(new model1(R.drawable.indian_food5,"6"));
        list.add(new model1(R.drawable.indian_food6,"7"));
        list.add(new model1(R.drawable.indian_food7,"8"));
        list.add(new model1(R.drawable.indian_food8,"9"));
        list.add(new model1(R.drawable.indian_food9,"10"));
        list.add(new model1(R.drawable.indian_food10,"11"));
        list.add(new model1(R.drawable.indian_food11,"12"));
        list.add(new model1(R.drawable.indian_food12,"13"));

        Adapter1 adapter =new Adapter1(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);


//        LinearLayoutManager linearLayoutManager1 =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//       recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"Second view is clicked",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}