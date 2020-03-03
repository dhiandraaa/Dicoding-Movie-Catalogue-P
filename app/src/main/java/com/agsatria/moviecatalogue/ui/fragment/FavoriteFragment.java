package com.agsatria.moviecatalogue.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agsatria.moviecatalogue.R;
import com.agsatria.moviecatalogue.adapter.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class FavoriteFragment extends Fragment {


    public FavoriteFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);

        ViewPager viewPager = rootView.findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPageAdapter(Objects.requireNonNull(getChildFragmentManager())));

        TabLayout tabLayout = rootView.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        Objects.requireNonNull(tabLayout.getTabAt(0)).setText(getResources().getText(R.string.movie));
        Objects.requireNonNull(tabLayout.getTabAt(1)).setText(getResources().getText(R.string.tv_show));

        return rootView;
    }

}
