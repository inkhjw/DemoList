package com.sun.bookread.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sun.bookread.R;

/**
 * author:何佳伟   阅读
 */
public class FragmentRead2 extends Fragment {

    public FragmentRead2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = initView(inflater);
        return v;
    }

    public View initView(LayoutInflater inflater) {
        View v = inflater.inflate(R.layout.fragment_read2, null);
        return v;
    }
}
