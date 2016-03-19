package pl.donutgroup.colormaster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class ActivityColorMaster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_master);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                FragmentWelcome.getInstance(), FragmentWelcome.class.getName()).commit();
    }

    public void loadFragment(Fragment fragment) {
        String tag = fragment.getClass().getName();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                fragment, tag).addToBackStack(tag).commit();
    }

}
