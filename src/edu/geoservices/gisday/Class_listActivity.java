package edu.geoservices.gisday;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Class_listActivity extends MainActivity {  
	
	
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.class_list);
 
    
			final ImageButton back = (ImageButton) findViewById(R.id.return_b);

   
 
 
 
			back.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
							finish();
							}
						}); 
	

}
}