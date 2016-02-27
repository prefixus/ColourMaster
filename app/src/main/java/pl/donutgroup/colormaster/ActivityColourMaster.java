package pl.donutgroup.colormaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityColourMaster extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_colour_master);
		getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, FragmentMainMenu.getInstance(), FragmentMainMenu.class.getName()).commit();
		//donut donut
	}
}
