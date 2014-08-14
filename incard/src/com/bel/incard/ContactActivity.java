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

				// 指定要呼叫的 Activity Class
				Intent newAct = new Intent();
				newAct.setClass(ContactActivity.this, MainActivity.class);

				// 呼叫新的 Activity Class
				startActivity(newAct);

				// 結束原先的 Activity Class
				ContactActivity.this.finish();
			}
		});
	}
}
