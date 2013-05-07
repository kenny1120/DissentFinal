package com.example.dissentfinal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class pageAdapter extends PagerAdapter{

	public int getCount() {

		return 2;
	}

	public Object instantiateItem(final View collection, int position) {
		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View v = null;
		switch (position) {
		case 0:
			v = inflater.inflate(R.layout.activity_home_screen, null);
			break;
		case 1:
			v = inflater.inflate(R.layout.activity_menu_screen, null);
	        Button MenuAbout = (Button) v.findViewById(R.id.mAbout);
	        MenuAbout.setBackgroundColor(Color.TRANSPARENT);
	        MenuAbout.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
						Context context = collection.getContext();
						Intent mA = new Intent(context, AboutScreen.class);
						context.startActivity(mA);

	        	
				}
	        });
	        Button MenuHand = (Button) v.findViewById(R.id.mHand);
	        MenuHand.setBackgroundColor(Color.TRANSPARENT);
	        MenuHand.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
						Context context = collection.getContext();
						Intent mH = new Intent(context, HandBookScreen.class);
						context.startActivity(mH);

					
				}
	        });
	        Button MenuScavange = (Button) v.findViewById(R.id.mScavange);
	        MenuScavange.setBackgroundColor(Color.TRANSPARENT);
	        MenuScavange.setOnClickListener(new View.OnClickListener() {
	        	@Override
	        	public void onClick(View v) {
						Context context = collection.getContext();
						Intent mO = new Intent(context, OpportunityScreen.class);
						context.startActivity(mO);
						
		
	        	}
	        });
	        Button MenuMap = (Button) v.findViewById(R.id.mMap);
	        MenuMap.setBackgroundColor(Color.TRANSPARENT);
	        MenuMap.setOnClickListener(new View.OnClickListener() {
	        	@Override
	        	public void onClick(View v) {
						Context context = collection.getContext();
						Intent mCh = new Intent(context, CheckScreen.class);
						context.startActivity(mCh);
						
		
	        	}
	        });
	        Button MenuContact = (Button) v.findViewById(R.id.mContact);
	        MenuContact.setBackgroundColor(Color.TRANSPARENT);
	        MenuContact.setOnClickListener(new View.OnClickListener() {
	        	@Override
	        	public void onClick(View v) {
						Context context = collection.getContext();
						Intent mC = new Intent(context, ContactScreen.class);
						context.startActivity(mC);
						
		
	        	}
	        });
	        break;
		}
		
		((ViewPager) collection).addView(v, 0);
		
		return v;
	}
	
	@Override
	public void destroyItem(View arg0, int arg1, Object arg2){
		((ViewPager) arg0).removeView((View) arg2);
	}
	
	@Override
	public boolean isViewFromObject(View arg0, Object arg1){
		return arg0 == ((View) arg1);
	}

	@Override
	public Parcelable saveState() {
		return null;
	}
}
