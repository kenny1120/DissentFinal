package com.example.dissentfinal;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.app.Activity;


public class MenuScreen extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        pageAdapter adapter = new pageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.panelpager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(1);
        
  
		
	}
}


