package com.innovation.followers.android.apps.GoldenCook;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SplashActivity extends Activity
{
    protected boolean _active = true;
    protected int _splashTime = 3000;  
    public ImageView imgView;

    /** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);	
	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.splash);
	Thread splashTread = new Thread()
	{
	    @SuppressWarnings("deprecation") @Override public void run()
	    {
		try
		{
		    int waited = 0;
		    while (_active && (waited < _splashTime))
		    {
			sleep(100);
			if (_active)
			{
			    waited += 100;
			}
		    }
		}
		catch (InterruptedException e)
		{
		    // do nothing
		}
		finally
		{
		    finish(); //finish so that no back is required.
		    Intent intent = new Intent(SplashActivity.this, Categories.class);		    // 
		    startActivity(intent);
		}
	    }
	};
	splashTread.start();
    }
}
