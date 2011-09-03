package br.com.wfsneto.sistemadecompras;

import android.app.Activity;
import android.os.Bundle;

import android.app.AlertDialog;
import android.widget.*;
import android.view.*;


public class AppCompras extends Activity {
	/** Called when the activity is first created. */

	CheckBox chkarroz, chkleite, chkcarne, chkfeijao, chkcoca;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		chkarroz = (CheckBox) findViewById(R.id.chkarroz);
		chkleite = (CheckBox) findViewById(R.id.chkleite);
		chkcarne = (CheckBox) findViewById(R.id.chkcarne);
		chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
		chkcoca = (CheckBox) findViewById(R.id.chkcoca);
		Button bttotal = (Button) findViewById(R.id.bttotal);

		bttotal.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				double total = 0;
				if (chkarroz.isChecked()) {
					total += 2.69;
				}
				if (chkleite.isChecked()) {
					total += 5;
				}
				if (chkcarne.isChecked()) {
					total += 9.7;
				}
				if (chkfeijao.isChecked()) {
					total += 2.3;
				}
				if (chkcoca.isChecked()) {
					total += 2;
				}
				AlertDialog.Builder dialogo = new AlertDialog.Builder(
						AppCompras.this);
				// Defino o título
				dialogo.setTitle("Aviso");
				// colocando a mensagem que vai ter dentro do Dialog
				dialogo.setMessage("Valor total da compra :"
						+ String.valueOf(total));
				// adicionando o botão de OK
				dialogo.setNeutralButton("OK", null);
				// mostrando o Dialog
				dialogo.show();
			}
		});

	}
}