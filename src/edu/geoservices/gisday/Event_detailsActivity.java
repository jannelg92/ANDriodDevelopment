package edu.geoservices.gisday;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Event_detailsActivity extends CalenderActivity {  
	
	
	
	public void onCreate(Bundle savedInstanceState) {
		
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.event_details);
	        
	        
	        final ImageButton back = (ImageButton) findViewById(R.id.return_b);
   
	        back.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View v) {
	        		finish();
	        	}
	        }); 
	 
	 
	 }
	
	
	
	
	
}