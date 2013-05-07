package com.example.dissentfinal;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CheckScreen extends Activity implements OnClickListener{
	Button check_menu;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_screen);
		check_menu = (Button) findViewById(R.id.checkMenu);
		check_menu.setOnClickListener(this);
		check_menu.setBackgroundColor(Color.TRANSPARENT);
		
	}

	@Override
	public void onClick(View v) {
		finish();
		
	
	}
}
