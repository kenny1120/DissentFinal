package com.example.dissentfinal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OpportunityScreen extends Activity implements OnClickListener{
	Button opp_menu;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opportunity_screen);
		opp_menu = (Button) findViewById(R.id.oppMenu);
		opp_menu.setOnClickListener(this);
		opp_menu.setBackgroundColor(Color.TRANSPARENT);
		
	}

	@Override
	public void onClick(View v) {
		finish();
		
	
	}
}
