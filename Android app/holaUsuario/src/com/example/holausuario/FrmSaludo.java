package com.example.holausuario;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FrmSaludo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saludo);
			//localizar los controles
		TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
		
		//recuperamos la informaci�n pasada por el intent
		Bundle bundle  = this.getIntent().getExtras();
		
		// construimos el mensaje a mostrar
		txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
			
	}
}
