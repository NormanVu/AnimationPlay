package com.mgoenka.animationplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
