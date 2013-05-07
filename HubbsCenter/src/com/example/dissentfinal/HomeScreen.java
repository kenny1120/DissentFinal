package com.example.dissentfinal;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater.Filter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class HomeScreen extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        
        pageAdapter adapter = new pageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.panelpager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
		
    }
}



