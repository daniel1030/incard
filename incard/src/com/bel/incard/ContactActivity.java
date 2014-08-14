package com.bel.incard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ContactActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);

		Button btMain = (Button) findViewById(R.id.btAbout);
		btMain.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				// ���w�n�I�s�� Activity Class
				Intent newAct = new Intent();
				newAct.setClass(ContactActivity.this, MainActivity.class);

				// �I�s�s�� Activity Class
				startActivity(newAct);

				// ��������� Activity Class
				ContactActivity.this.finish();
			}
		});
	}
}
