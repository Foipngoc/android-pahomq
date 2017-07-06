package com.example.aissocket;

import android.app.Activity;
import android.os.Bundle;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//MqttService.actionStart(this); 
	}

	@Override  
	 protected void onDestroy() 
	{  
	  // TODO Auto-generated method stub  
	  super.onDestroy();  
	  MqttService.actionStop(this);  
	 } 
}
