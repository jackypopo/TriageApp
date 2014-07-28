package com.mkyong.android;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class App10Activity extends Activity {
	
	Button button, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main10);
		addListenerOnButton();
	}


	
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.button110);
		button2= (Button) findViewById(R.id.button210);
		

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, App9Activity.class);
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

		
	}
}
