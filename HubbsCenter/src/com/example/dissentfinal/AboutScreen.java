package com.example.dissentfinal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * AboutScreen class displays the About Screen layout and is an Activity
 * It implements the OnClickListener that allows the user to press a button that sends them back to the Menu Activity
 * @author kennethbello
 *
 */
public class AboutScreen extends Activity implements OnClickListener{
	/**
	 * about_menu button allows the user to return to the Menu Activity when clicked
	 */
	Button about_menu;
	
	/**
	 * onCreate initializes the Activity (AboutScreen)
	 * it is called when the Activity starts
	 */
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_screen);
		about_menu = (Button) findViewById(R.id.aboutMenu);
		about_menu.setOnClickListener(this);
		about_menu.setBackgroundColor(Color.TRANSPARENT);
		
	}
	
	/**
	 * onCLick method called when a view has been clicked
	 */
	@Override
	public void onClick(View v) {
		finish();
		
	
	}
}
