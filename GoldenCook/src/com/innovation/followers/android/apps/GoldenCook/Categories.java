package com.innovation.followers.android.apps.GoldenCook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class Categories extends Activity {
	public static RealViewSwitcher realViewSwitcher = null;
	int Catagoryids[] = {R.string.Catagory1	
		,R.string.Catagory2	
		,R.string.Catagory3	
		,R.string.Catagory4	
		,R.string.Catagory5	
		,R.string.Catagory6	
		,R.string.Catagory7
		,R.string.Catagory8
		,R.string.Catagory9
		,R.string.Catagory10
		,R.string.Catagory11};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categories);
		// create the view switcher
        realViewSwitcher = new RealViewSwitcher(getApplicationContext());
        for (int i = 0; i < 11; i++) {
	        LayoutInflater inflater = getLayoutInflater();
        	final View dialoglayout = inflater.inflate(R.layout.items, (ViewGroup) findViewById(R.id.iditem));
        	((TextView)(dialoglayout.findViewById(R.id.textcat))).setText(getResources().getString(Catagoryids[i]));
        	ImageView imgv = (ImageView) dialoglayout.findViewById(R.id.imagecat);
        	imgv.setOnClickListener(new OnClickListener() {
			    public void onClick(View v) {
			    	Intent intent = new Intent(Categories.this,Recipes.class);
					startActivity(intent);
			    }
			});
			realViewSwitcher.addView(dialoglayout);
		}
     // set as content view
 		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
 		addContentView(realViewSwitcher,lp);
 		realViewSwitcher.setOnScreenSwitchListener(onScreenSwitchListener);
	}
	
private final RealViewSwitcher.OnScreenSwitchListener onScreenSwitchListener = new RealViewSwitcher.OnScreenSwitchListener() {
		
		
		public void onScreenSwitched(int screen) {
			// this method is executed if a screen has been activated, i.e. the screen is completely visible
			//  and the animation has stopped (might be useful for removing / adding new views)
			System.out.println("i am in screen "+screen);
			Recipes.m_categorySel = screen;
		}
		
	};

}
