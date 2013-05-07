package com.example.dissentfinal;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutScreen extends Activity implements OnClickListener{
	Button about_menu;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_screen);
		about_menu = (Button) findViewById(R.id.aboutMenu);
		about_menu.setOnClickListener(this);
		about_menu.setBackgroundColor(Color.TRANSPARENT);
		
	}

	@Override
	public void onClick(View v) {
		finish();
		
	
	}
}
