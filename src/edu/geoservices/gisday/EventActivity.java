package edu.geoservices.gisday;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class EventActivity extends MainActivity { 
	
	
	
	
	 public void onCreate(Bundle savedInstanceState) {
			
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.event);
	        
	        
	     final ImageButton back = (ImageButton) findViewById(R.id.return_b);
	       
	     
	     back.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View v) {
	        		finish();
	        	}
	        }); 
	     
	     
	 }
	 

	    
	

}