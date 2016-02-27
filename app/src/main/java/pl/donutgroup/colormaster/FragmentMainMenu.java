package pl.donutgroup.colormaster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kasia on 2016-02-27.
 */
public class FragmentMainMenu extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_main_menu, null);
		return v;
	}

	public static FragmentMainMenu getInstance() {return new FragmentMainMenu();}
}
