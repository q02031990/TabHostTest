package tiengduc123.com.tabhosttest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tiengduc123.com.tabhosttest.R;

/**
 * Created by Dell on 17/03/2016.
 */
public class Fragment1 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1_layout, container, false);
        return v;
    }
}
