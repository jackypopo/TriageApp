package com.mkyong.android;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class App9Activity extends Activity {

	Button button, button2, head;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main9);
		addListenerOnButton();
	}

	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.button19);
		button2= (Button) findViewById(R.id.button29);
		head =(Button) findViewById(R.id.HeadMaleFront);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, App10Activity.class);
                startActivity(intent);   
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, App11Activity.class);
                startActivity(intent);   

			}

		});
		
		head.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(context, "Cabeza", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(context, App13Activity.class);
                startActivity(intent);
				
				
			}
		});
	}
}
