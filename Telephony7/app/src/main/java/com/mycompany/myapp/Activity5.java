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
public class Activity5 extends Activity {

	EditText editPhone4,editMessage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call1);

		editPhone4= findViewById(R.id.number4);
		editMessage4= findViewById(R.id.editMessage);
		editPhone4.setText("Reeze(09217075650)");

	}
	public void Send2(View view) {
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
		phone= editPhone4.getText().toString().trim();
		message= editMessage4.getText().toString().trim();
		SmsManager smsManager=SmsManager.getDefault();

		smsManager.sendTextMessage(phone, null, message, null, null);
		Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
	}
}
