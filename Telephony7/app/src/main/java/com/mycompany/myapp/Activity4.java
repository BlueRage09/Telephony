package com.mycompany.myapp;
import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class Activity4 extends Activity {

	EditText editPhone3,editMessage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call1);

		editPhone3= findViewById(R.id.number3);
		editMessage3= findViewById(R.id.editMessage);
		editPhone3.setText("Lorie(09269071430)");

	}
	public void Send3(View view) {
		int permissionCheck = 
			ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
		if (permissionCheck== PackageManager.PERMISSION_GRANTED){
			sendMessage();
		}else {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
		}
	}
	private void sendMessage() {

		String phone, message;
		phone= editPhone3.getText().toString().trim();
		message= editMessage3.getText().toString().trim();
		SmsManager smsManager=SmsManager.getDefault();

		smsManager.sendTextMessage(phone, null, message, null, null);
		Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
	}
}
