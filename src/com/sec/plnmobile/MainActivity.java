package com.sec.plnmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.sec.plnmobile.belipulsa.BeliPulsaActivity;
import com.sec.plnmobile.feedback.FeedbackActivity;
import com.sec.plnmobile.statuspemesanan.StatusPemesananActivity;
import com.sec.plnmobile.twitter.TwitterActivity;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.beli_pulsa).setOnClickListener(this);
		findViewById(R.id.feedback).setOnClickListener(this);
		findViewById(R.id.status_pemesanan).setOnClickListener(this);
		findViewById(R.id.twitter).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.beli_pulsa: {
			intent.setClass(this, BeliPulsaActivity.class);
			break;
		}
		case R.id.feedback: {
			intent.setClass(this, FeedbackActivity.class);
			break;
		}
		case R.id.status_pemesanan: {
			intent.setClass(this, StatusPemesananActivity.class);
			break;
		}
		case R.id.twitter: {
			intent.setClass(this, TwitterActivity.class);
			break;
		}
		}

		startActivity(intent);
	}

}
