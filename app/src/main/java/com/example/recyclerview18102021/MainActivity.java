package com.example.recyclerview18102021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRcvFood;
    List<FoodModel> mListFood = FoodModel.getMock();
    FoodAdapter mFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRcvFood = findViewById(R.id.recyclerViewFood);


        mListFood = new ArrayList<>();
        mListFood = FoodModel.getMock();

        mFoodAdapter = new FoodAdapter(mListFood,this);

        mRcvFood.setHasFixedSize(true);
        mRcvFood.setAdapter(mFoodAdapter);


    }

}