package com.kevinrohling.viewflipperexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
    
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ViewFlipper viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        
        Button nextButton = (Button) this.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new OnClickListener()
        {

			@Override
			public void onClick(View v) {
				viewFlipper.setInAnimation(MainActivity.this, R.anim.view_transition_in_left);
				viewFlipper.setOutAnimation(MainActivity.this, R.anim.view_transition_out_left);
				viewFlipper.showNext();
			}
        	
        });
        
        Button previousButton = (Button) this.findViewById(R.id.previousButton);
        previousButton.setOnClickListener(new OnClickListener()
        {

			@Override
			public void onClick(View v) {
				viewFlipper.setInAnimation(MainActivity.this, R.anim.view_transition_in_right);
				viewFlipper.setOutAnimation(MainActivity.this, R.anim.view_transition_out_right);
				viewFlipper.showPrevious();
			}
        	
        });
        
    }
}