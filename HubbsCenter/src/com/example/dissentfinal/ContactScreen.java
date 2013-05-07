package com.example.dissentfinal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ContactScreen extends Activity implements OnClickListener{
	Button contact_menu;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_screen);
		contact_menu = (Button) findViewById(R.id.contactMenu);
		contact_menu.setOnClickListener(this);
		contact_menu.setBackgroundColor(Color.TRANSPARENT);
		
	}

	@Override
	public void onClick(View v) {
		finish();
		
	
	}
}

