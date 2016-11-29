package com.sds.study.cnavi3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by seon on 2016-11-29.
 */

public class LoginFragment extends Fragment {

    String TAG;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TAG=this.getClass().getName();
        View view = inflater.inflate(R.layout.fragment_login,null);
        Log.d(TAG,"LoginFragment"+view);
        return view;
    }
}
