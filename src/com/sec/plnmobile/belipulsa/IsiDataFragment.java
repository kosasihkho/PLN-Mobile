package com.sec.plnmobile.belipulsa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sec.plnmobile.R;

public class IsiDataFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		final View v = inflater.inflate(R.layout.fragment_isidata, container, false);
		v.findViewById(R.id.isidata_selesai).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Pembelian Berhasil", Toast.LENGTH_LONG).show();
			}
		});
		return v;
	}
}
