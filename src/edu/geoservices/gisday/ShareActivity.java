package edu.geoservices.gisday;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Bundle;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ShareActivity extends Activity { 
	
	
	
	public void onCreate(Bundle savedInstanceState) {
		
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.share);
	        
	        
	        final ImageButton back = (ImageButton) findViewById(R.id.return_b);
	   	    
	   	     
	   	     
	   	     back.setOnClickListener(new View.OnClickListener() {
	   	        	public void onClick(View v) {
	   	        		finish();
	   	        	}
	   	        }); 
	        
	        
	}
	 

}