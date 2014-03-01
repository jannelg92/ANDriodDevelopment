package edu.geoservices.gisday;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Log_optionsActivity extends MainActivity {  
	
	
		 public void onCreate(Bundle savedInstanceState) {
				
			 super.onCreate(savedInstanceState);
		        setContentView(R.layout.log_options);
		        
		     final ImageButton back = (ImageButton) findViewById(R.id.return_b);
		     final Button logIn = (Button) findViewById(R.id.login_b); 
		     final Button signUp = (Button) findViewById(R.id.create_login_b);
		     
		     
		     signUp.setOnClickListener(new View.OnClickListener() {
		    	 public void onClick(View v) {
		    		 Intent sign_up = new Intent(Log_optionsActivity.this, SignupActivity.class); 
		    		 startActivity(sign_up);
		    	 }
		     });
		     
		     logIn.setOnClickListener(new View.OnClickListener() {
		    	 public void onClick(View v) {
		    		 Intent log_in = new Intent(Log_optionsActivity.this, LoginActivity.class);
		    		 startActivity(log_in);
		    	 } }); 
		     
		     
		     
		     back.setOnClickListener(new View.OnClickListener() {
		        	public void onClick(View v) {
		        		finish();
		        	}
		        }); 
		     
		     
		  
		     
		 }
	
	
	
	
}