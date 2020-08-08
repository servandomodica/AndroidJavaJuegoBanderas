package com.example.banderapaises;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String [] banderas = {"Argentina","Bolivia","Brasil","Chile"};
	String adivinar;
	int puntos;
	TextView tv1;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        seleccionarPais();
    }

    void seleccionarPais() {
    	int aleatorio=(int)(Math.random()*banderas.length);
    	adivinar=banderas[aleatorio];
    	Toast.makeText(this, "¿Cuál bandera es la del país "+adivinar+"?", Toast.LENGTH_LONG).show();
    }
        
    public void presionArgentina (View v) {
    	if (adivinar.equals("Argentina")) {
    		Toast.makeText(this, "Muy bien!", Toast.LENGTH_LONG).show();
    		seleccionarPais();
    		gano();
    	}else{
    		Toast.makeText(this, "Está mal...", Toast.LENGTH_LONG).show();
    	}
    }
    
    public void presionBolivia (View v) {
    	if (adivinar.equals("Bolivia")) {
    		Toast.makeText(this, "Muy bien!", Toast.LENGTH_LONG).show();
    		seleccionarPais();
    		gano();
    	}else{
    		Toast.makeText(this, "Está mal...", Toast.LENGTH_LONG).show();
    	}
    }
    
    public void presionBrasil (View v) {
    	if (adivinar.equals("Brasil")) {
    		Toast.makeText(this, "Muy bien!", Toast.LENGTH_LONG).show();
    		seleccionarPais();
    		gano();
    	}else{
    		Toast.makeText(this, "Está mal...", Toast.LENGTH_LONG).show();
    	}
    }
    
    public void presionChile (View v) {
    	if (adivinar.equals("Chile")) {
    		Toast.makeText(this, "Muy bien!", Toast.LENGTH_LONG).show();
    		seleccionarPais();
    		gano();
    	}else{
    		Toast.makeText(this, "Está mal...", Toast.LENGTH_LONG).show();
    	}
    }
    
    private void gano() {
    	puntos++;
    	tv1.setText("Puntos: "+puntos);
    }
    
    public void finalizar (View v) {
    	finish();
    } 
}
