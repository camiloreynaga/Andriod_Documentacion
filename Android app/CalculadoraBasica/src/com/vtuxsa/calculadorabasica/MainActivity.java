package com.vtuxsa.calculadorabasica;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity  implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View boton = findViewById(R.id.button1);
		boton.setOnClickListener(this);
		
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View vista)
	{
		TextView temp; 
		TextView resultado =(TextView)findViewById(R.id.textView2);
		temp = (TextView)findViewById(R.id.editText1);
		try {
			float a= Float.parseFloat(temp.getText().toString());
			temp = (TextView)findViewById(R.id.editText2);
			float b= Float.parseFloat(temp.getText().toString());
			resultado.setText("Resultado "+ (a+b));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			resultado.setText("Introducir sólo números");
		}
	}

	

}
