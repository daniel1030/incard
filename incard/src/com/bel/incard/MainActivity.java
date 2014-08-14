package com.bel.incard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btContact = (Button) findViewById(R.id.btContact);
		btContact.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				// 指定要呼叫的 Activity Class
				Intent newAct = new Intent();
				newAct.setClass(MainActivity.this, ContactActivity.class);

				// 呼叫新的 Activity Class
				startActivity(newAct);

				// 結束原先的 Activity Class
				MainActivity.this.finish();
			}
		});

	}
}
