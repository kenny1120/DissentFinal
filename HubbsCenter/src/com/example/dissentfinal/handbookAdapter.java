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

public class handbookAdapter extends PagerAdapter{

	public int getCount() {

		return 3;
	}

	public Object instantiateItem(final View collection, int position) {
		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View v = null;
		switch (position) {
		case 0:
			v = inflater.inflate(R.layout.activity_hand_screen, null);

			break;
		case 1:
			v = inflater.inflate(R.layout.activity_hand_screen1, null);
	        Button MenuScavange1 = (Button) v.findViewById(R.id.handbookMenu1);
	        MenuScavange1.setBackgroundColor(Color.TRANSPARENT);
	        MenuScavange1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
						Context context = collection.getContext();
						Intent mS1 = new Intent(context, HomeScreen.class);
						context.startActivity(mS1);

	        	
				}
	        });
	        break;
		case 2:
			v = inflater.inflate(R.layout.activity_hand_screen2, null);
	        Button MenuScavange2 = (Button) v.findViewById(R.id.handbookMenu2);
	        MenuScavange2.setBackgroundColor(Color.TRANSPARENT);
	        MenuScavange2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
						Context context = collection.getContext();
						Intent mS2 = new Intent(context, HomeScreen.class);
						context.startActivity(mS2);

	        	
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