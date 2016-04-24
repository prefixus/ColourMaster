package pl.donutgroup.colormaster;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;



public class FragmentGameSelectColor extends Fragment {

    public static final float WEIGHT_DEF_VALUE = 0.4f;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_game_select_color, null);

        List<Button> buttons = new ArrayList<>();
        buttons.add((Button) v.findViewById(R.id.bottom_left_button));
        buttons.add((Button) v.findViewById(R.id.bottom_right_button));
        buttons.add((Button) v.findViewById(R.id.top_left_button));
        buttons.add((Button) v.findViewById(R.id.top_right_button));

        //set buttons height
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int displayWidth = displaymetrics.widthPixels;

        TypedArray typedArray = getActivity().obtainStyledAttributes(R.style.ButtonSelectColor, new int[]{android.R.attr.layout_weight});
        float weight = typedArray.getFloat(0, WEIGHT_DEF_VALUE);
        int buttonHeight = (int) (displayWidth * weight);

        for (Button b : buttons) {
            LayoutParams layoutParams = b.getLayoutParams();

            layoutParams.height = buttonHeight;
            b.setLayoutParams(layoutParams);
            b.invalidate();
        }
        typedArray.recycle();

        return v;
    }


    public static Fragment getInstance() {
        return new FragmentGameSelectColor();
    }
}
