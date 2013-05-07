package com.example.dissentfinal;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HandBookScreen extends Activity{
	Button scavange_menu;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hand_screen);
        handbookAdapter adapter = new handbookAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.panelpager1);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);

		
	}
}
