package com.sec.plnmobile.statuspemesanan;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.sec.plnmobile.R;

public class StatusPemesananActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_statuspemesanan);
		((ListView) findViewById(R.id.statuspemesanan_list)).setAdapter(new StatusPemesananAdapter());
	}
}

class StatusPemesananAdapter extends BaseAdapter {
	class Item {
		String mPulsa;
		String mMeteran;
		String mTanggal;
		String mHp;
		Status mStatus;

		public Item(String pulsa, String meteran, String tanggal, String noHp, Status status) {
			mPulsa = pulsa;
			mMeteran = meteran;
			mTanggal = tanggal;
			mStatus = status;
			mHp = noHp;
		}
	}

	enum Status {
		SUKSES, BELUM_BAYAR
	}

	List<Item> mItems = new ArrayList<Item>();

	public StatusPemesananAdapter() {
		mItems.add(new Item("20,000", 		"4543512XXX", "12/01/2014", "08122987123", Status.SUKSES));
		mItems.add(new Item("200,000", 		"2443512XXX", "01/02/2014", "08129845123", Status.BELUM_BAYAR));
		mItems.add(new Item("500,000", 		"2543512XXX", "07/05/2014", "08352987123", Status.SUKSES));
		mItems.add(new Item("1,000,000", 	"3543512XXX", "20/07/2014", "08422987123", Status.BELUM_BAYAR));
		mItems.add(new Item("250,000", 		"9763512XXX", "13/01/2014", "08412457123", Status.BELUM_BAYAR));
		mItems.add(new Item("300,000", 		"4543512XXX", "17/01/2014", "08412987123", Status.SUKSES));
		mItems.add(new Item("100,000", 		"3453512XXX", "19/01/2015", "08129857123", Status.SUKSES));
		mItems.add(new Item("100,000", 		"3235512XXX", "15/01/2015", "08292387123", Status.BELUM_BAYAR));
		mItems.add(new Item("40,000", 		"4352412XXX", "30/04/2015", "08132987123", Status.SUKSES));
		mItems.add(new Item("1,000,000", 	"4543512XXX", "10/05/2015", "08259587123", Status.BELUM_BAYAR));
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
		View v = View.inflate(parent.getContext(), R.layout.view_statuspemesanan, null);
		Item item = mItems.get(position);
		((TextView) v.findViewById(R.id.statuspemesanan_pulsa)).setText(item.mPulsa);
		((TextView) v.findViewById(R.id.statuspemesanan_meteran)).setText(item.mMeteran);
		((TextView) v.findViewById(R.id.statuspemesanan_nohp)).setText(item.mHp);
		((TextView) v.findViewById(R.id.statuspemesanan_tanggal)).setText(item.mTanggal);
		if (item.mStatus == Status.SUKSES) {
			((Button) v.findViewById(R.id.statuspemesanan_status)).setText("SUKSES");
			((Button) v.findViewById(R.id.statuspemesanan_status)).setBackgroundResource(R.drawable.btn_rounded_bg_green);
		} else {
			((Button) v.findViewById(R.id.statuspemesanan_status)).setText("BELUM\nBAYAR");
			((Button) v.findViewById(R.id.statuspemesanan_status)).setBackgroundResource(R.drawable.btn_rounded_bg_red);
		}
		return v;
	}
}