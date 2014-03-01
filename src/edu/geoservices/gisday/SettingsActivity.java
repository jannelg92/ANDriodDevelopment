package edu.geoservices.gisday;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class SettingsActivity extends MainActivity {  
	
	 public void onCreate(Bundle savedInstanceState) {
			
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.settings);
	        
	        final ImageButton back = (ImageButton) findViewById(R.id.return_b);

	        
	        
	        
	        
			back.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
							finish();
							}
						}); 
	 
}
} 