package com.example.Project_Nhom23;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager extends FragmentStateAdapter {


    public ViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPager(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new WalletFragment();
            case 2:
                return new ChartFragment();
            case 3:
                return new MoreFragment();

                default: new HomeFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
