package com.example.holausuario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//obtenemos una referencia de los controles de la interfaz
		final EditText txtNombre= (EditText)findViewById(R.id.TxtNombre);
		final Button btnHola = (Button)findViewById(R.id.BtnHola);
		
		//implementamos el nuevo evento click del botón
		btnHola.setOnClickListener(new OnClickListener() {
			
			//@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Creamos el intent
				Intent intent = new Intent(MainActivity.this,FrmSaludo.class);
				
				//creamos la información a pasar entre actividades
				Bundle b = new Bundle();
				b.putString("NOMBRE", txtNombre.getText().toString());
				
				//añadimos la información del intent
				intent.putExtras(b);
				
				//Iniciamos la nueva actividad
				startActivity(intent);
				
				
					
			}
		});
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
