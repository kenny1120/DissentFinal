package com.example.dissentfinal;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class HomeScreen extends Activity implements OnClickListener {
	Button menu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        menu = (Button) findViewById(R.id.menu_button);
        menu.setOnClickListener(this);
    }
    
    public void onClick(View v){
    	switch (v.getId()){
    	case R.id.menu_button:
    		Intent menuB = new Intent(this, MenuScreen.class);
    		startActivity(menuB);
    		break;
    	}
    		
    }
}


