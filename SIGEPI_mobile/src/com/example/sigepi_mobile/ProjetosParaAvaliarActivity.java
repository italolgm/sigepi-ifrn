package com.example.sigepi_mobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProjetosParaAvaliarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projetos_para_avaliar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_projetos_para_avaliar, menu);
		return true;
	}

}
