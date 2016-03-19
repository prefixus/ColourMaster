package pl.donutgroup.colormaster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kasia on 2016-02-27.
 */
public class FragmentWelcome extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_welcome, null);
		return v;
	}

	public static FragmentWelcome getInstance() {
		return new FragmentWelcome();
	}
}
