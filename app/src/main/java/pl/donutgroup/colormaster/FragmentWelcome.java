package pl.donutgroup.colormaster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Kasia on 2016-02-27.
 */
public class FragmentWelcome extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_welcome, null);
		((Button)v.findViewById(R.id.play)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				((ActivityColorMaster)getActivity()).loadFragment(FragmentGameSelectColor.getInstance());
			}
		});
		return v;
	}

	public static FragmentWelcome getInstance() {
		return new FragmentWelcome();
	}
}
