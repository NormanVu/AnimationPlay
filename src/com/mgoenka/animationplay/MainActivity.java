package com.mgoenka.animationplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button btnAnimate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnAnimate = (Button) findViewById(R.id.btnAnimate);
		TextView tvTrackPad = (TextView) findViewById(R.id.tvTrackPad);
		
		tvTrackPad.setOnTouchListener(new OnSwipeTouchListener(this) {
		  @Override
		  public void onSwipeDown() {
		      Toast.makeText(MainActivity.this, "Down", Toast.LENGTH_SHORT).show();
		      btnAnimate.animate().yBy(100);
		  }
		  
		  @Override
		  public void onSwipeLeft() {
		      Toast.makeText(MainActivity.this, "Left", Toast.LENGTH_SHORT).show();
		      btnAnimate.animate().xBy(-100);
		  }
		  
		  @Override
		  public void onSwipeUp() {
		      Toast.makeText(MainActivity.this, "Up", Toast.LENGTH_SHORT).show();
		      btnAnimate.animate().yBy(-100);
		  }
		  
		  @Override
		  public void onSwipeRight() {
		      Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
		      btnAnimate.animate().xBy(100);
		  }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onAnimate(View v) {
		// Button btnAnimate = (Button) findViewById(R.id.btnAnimate);
		// btnAnimate.animate().alpha(0);
		// v.animate().alpha(0);
		// v.animate().scaleXBy(2.0f).scaleYBy(2.0f).setDuration(2000);
		
		/*
		ObjectAnimator scaleAnim = ObjectAnimator.ofFloat(v, "scaleX", 1.0f, 2.0f);
		scaleAnim.setDuration(3000);
		scaleAnim.setRepeatCount(ValueAnimator.INFINITE);
		scaleAnim.setRepeatMode(ValueAnimator.REVERSE);
		scaleAnim.start();
		*/
		
		/*
		Animator anim = AnimatorInflater.loadAnimator(this, R.animator.simple_fade_out);
		anim.setTarget(v);
		anim.start();
		*/
		
		// Inflate animation from XML
		// Animation animFadein = AnimationUtils.loadAnimation(this, R.anim.old_fade_out);  
		// v.startAnimation(animFadein);
		
		Intent i = new Intent(this, SecondActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slide_right_in, R.anim.slide_left_out);
	}
}
