package com.sec.plnmobile.belipulsa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.sec.plnmobile.R;

public class NominalBeliFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		final View v = inflater.inflate(R.layout.fragment_nominalbeli, container, false);

		Spinner spinner = (Spinner) v.findViewById(R.id.spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.nominal_options,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);

		v.findViewById(R.id.nominal_lanjut).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ViewPager pager = (ViewPager) getActivity().findViewById(R.id.pager);
				pager.setCurrentItem(pager.getCurrentItem() + 1);
			}
		});
		return v;
	}
}
