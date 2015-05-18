package com.sec.plnmobile.twitter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.sec.plnmobile.R;
import com.squareup.picasso.Picasso;

public class TwitterActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_twitter);
		((ListView) findViewById(R.id.twitter_list)).setAdapter(new TwitterAdapter(this));
	}
}

class TwitterAdapter extends BaseAdapter {
	private Activity mActivity;

	class Item {
		String mImgUrl;
		String mName;
		String mTimestamp;
		String mContent;

		public Item(String imgUrl, String name, String timestamp, String content) {
			mImgUrl = imgUrl;
			mName = name;
			mTimestamp = timestamp;
			mContent = content;
		}
	}

	List<Item> mItems = new ArrayList<Item>();

	public TwitterAdapter(Activity activity) {
		mActivity = activity;
		mItems.add(new Item("http://static.businessinsider.com/image/5249e0b9eab8ea0f02fa799a/image.jpg", "Rika", "2 minutes a go",
				"Kok belakangan sering mati listrik ya. Saya tinggal di pancoran"));
		mItems.add(new Item("http://t3.gstatic.com/images?q=tbn:ANd9GcS_IkVJsdynNHTkLOk3gXhoU8wURfZObPW-vz1TyTbazxX1r-wE", "Rony", "1 hour a go",
				"Rumah saya padam listriknya"));
		mItems.add(new Item("http://static.businessinsider.com/image/51966ad2eab8eab87d000007/image.jpg", "Cynthia", "2 days a go",
				"Gimana cara isi pulsa?"));
		mItems.add(new Item("http://static.businessinsider.com/image/5249e0b9eab8ea0f02fa799a/image.jpg", "Rebecca", "1 month a go",
				"Pak.. ada yang curi listrik"));
		mItems.add(new Item("http://www.adweek.com/socialtimes/files/2013/11/celebrities-not-on-twitter.jpg", "Jansen", "3 hours a go",
				"Rumah saya padam listriknya"));
	}

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = View.inflate(parent.getContext(), R.layout.view_twitter, null);
		Item item = mItems.get(position);
		Picasso.with(mActivity).load(item.mImgUrl).into((ImageView) v.findViewById(R.id.twitter_image));
		((TextView) v.findViewById(R.id.twitter_content)).setText(item.mContent);
		((TextView) v.findViewById(R.id.twitter_name)).setText(item.mName);
		((TextView) v.findViewById(R.id.twitter_timestamp)).setText(item.mTimestamp);
		return v;
	}
}
