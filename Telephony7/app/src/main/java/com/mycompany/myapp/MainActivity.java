package com.mycompany.myapp;


import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{



    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


	
       
		button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), Activity2.class);
					startActivity(intent);
				}
			});
			
			
		button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), Activity3.class);
					startActivity(intent);
				}
			});
			

		button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), Activity4.class);
					startActivity(intent);
				}
			});

		button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), Activity5.class);
					startActivity(intent);
				}
			});

		button5 = (Button)findViewById(R.id.button5);
		button5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), Activity6.class);
					startActivity(intent);
				}
			});


			

		
	}
	public void call1(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Mama"+"(09300237991)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
		}


	

	}
	public void call2(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Papa"+"(09773916989)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);

		}

	}



	public void call3(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Lorie"+"(09269071430)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);

		}
	}

	public void call4(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Reeze"+"(09217075650)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);

		}

	}


	public void call5(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Sean"+"(09957619626)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);

		}



	}
}
