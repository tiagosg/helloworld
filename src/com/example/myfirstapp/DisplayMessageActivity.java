package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(MyFirstAppActivity.EXTRA_MESSAGE);
		
		// Create the next view
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		// Set the View as the activity layout
//		setContentView(textView);
//		Toast toast = Toast.makeText(this, "teste", 1);
//		toast.show();
				
	}
	
	

}
