package edu.geoservices.gisday;

import android.R.menu;
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
import android.provider.Contacts.Intents.Insert;
import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
    public static boolean userAuthenticated; 
    
	int menu_layout;
	
    	
    	
    	public boolean  onCreateOptionsMenu(Menu menu) 
    	{
    		if (userAuthenticated) 
    		{			menu_layout = R.id.loggedin_user; 
    		getMenuInflater().inflate(menu_layout, menu); 
    		}
    		else 	
    						menu_layout = R.id.non_user; }
    			getMenuInflater().inflate(menu_layout, menu);
		        return true; 
		};
		      


    public boolean onOptionsItemSelected(MenuItem item) {
		if (LoginActivity.authenticateUser()) 	
			switch (item.getItemId()) {
					case R.id.menu2_99:
						System.exit(0);
						return true;
					case R.id.menu2_100:
						Intent calender = new Intent(MainActivity.this, CalenderActivity.class); 
						startActivity(calender);
						return true;
					case R.id.menu2_101:
						Intent share = new Intent(MainActivity.this, ShareActivity.class);
						startActivity(share);
						return true;
					case R.id.menu2_102:
						Intent checkin = new Intent(MainActivity.this, Event_checkinActivity.class);
						startActivity(checkin);
						return true;
					case R.id.menu2_103:
						Intent myevents = new Intent(MainActivity.this, EventActivity.class);
						startActivity(myevents);
						return true;
					case R.id.menu2_104:
						Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
						startActivity(settings);
						return true;
					default:
		                return super.onOptionsItemSelected(item);  }
			else { switch (item.getItemId()) {
						case R.id.menu1_99:
							Intent login = new Intent(MainActivity.this, Log_optionsActivity.class);
			                startActivity(login);
			                return true;
			            case R.id.menu1_100:
			            	Intent calender = new Intent(MainActivity.this, CalenderActivity.class); 
			            	startActivity(calender);
			            	return true;
			            case R.id.menu1_101:
			            	Intent share = new Intent(MainActivity.this, ShareActivity.class);
							startActivity(share);
			                return true;   
			            default:
			                return super.onOptionsItemSelected(item);	}
	               }  } 
	       

	   
	

	 public void onCreate(Bundle savedInstanceState) {
	
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        final Button eventButton = (Button) findViewById(R.id.event_b); // Get a handle to the button so we can add a handler for the click event
	        final ImageButton menuB = (ImageButton) findViewById(R.id.main_menub);
	        

	        
	        
	 eventButton.setOnClickListener(new View.OnClickListener() {
		 	@Override
		 	public void onClick(View v) {
		 		Intent calender = new Intent(MainActivity.this, CalenderActivity.class);
		 		startActivity(calender);	}
	 		});    
	 
	
	 }
		    @SuppressWarnings("deprecation")
		    public AlertDialog createAlertDialog(String msg, String buttonText) {
		        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
		        AlertDialog msgDialog = dialogBuilder.create();
		        //msgDialog.setTitle(title);
		        msgDialog.setMessage(msg);
		        msgDialog.setButton(buttonText, new DialogInterface.OnClickListener() {
		            @Override
		            public void onClick(DialogInterface dialog, int idx) {
		                return;
		            }
		        });

		        return msgDialog;
		    }

		    @SuppressWarnings("deprecation")
		    public AlertDialog createAlertDialogLogin(String msg, String buttonText) {
		        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
		        AlertDialog msgDialog = dialogBuilder.create();
		        //msgDialog.setTitle(title);
		        msgDialog.setMessage(msg);
		        msgDialog.setButton(buttonText, new DialogInterface.OnClickListener() {
		            @Override
		            public void onClick(DialogInterface dialog, int idx) {
		                openLogin();
		                return;
		            }
		        });

		        return msgDialog;
		    }

		    public void openLogin() {
		        Intent login = new Intent(this, Log_optionsActivity.class);
		        startActivity(login);
		    } 
		     
		

	
	} 

