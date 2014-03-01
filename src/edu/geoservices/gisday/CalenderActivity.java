package edu.geoservices.gisday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CalenderActivity extends MainActivity {  
	
	 public void onCreate(Bundle savedInstanceState) {
			
		 super.onCreate(savedInstanceState);
	     setContentView(R.layout.calender);
	     final ImageButton back = (ImageButton) findViewById(R.id.return_b);
	     final TextView event_calendar = (TextView) findViewById(R.id.event_cal);
	     final ImageView topLine = (ImageView) findViewById(R.id.imageView1); 
	     final Button event_details = (Button) findViewById(R.id.eventDetails_b);
	     
	     event_details.setOnClickListener(new View.OnClickListener() {

		    	 public void onClick(View v) {
		    		 Intent details = new Intent(CalenderActivity.this, Event_detailsActivity.class);
		    		 startActivity(details);
		    	 } }); 
	     
	     back.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View v) {
	        		finish();
	        	}
	        
	        
	 });

}
}