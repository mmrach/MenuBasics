package com.example.menubasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	
	private void showAcercaDe(){
		Intent i = new Intent(this,AcercaDe.class);
		startActivity(i);
	}
	
	private void showPreferencias(){
		Intent i = new Intent(this,Preferencias.class);
		startActivity(i);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch(id){
		case R.id.action_settings:
			showPreferencias();
			return true;
		case R.id.action_acerca_de:
			showAcercaDe();
			return true;
		default:
			return super.onOptionsItemSelected(item); 
		}
	}
}