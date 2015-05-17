package com.sec.plnmobile.feedback;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.sec.plnmobile.R;

public class FeedbackActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		findViewById(R.id.feedback_send).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(FeedbackActivity.this, "Feedback Sent", Toast.LENGTH_LONG).show();
			}
		});
	}
}
