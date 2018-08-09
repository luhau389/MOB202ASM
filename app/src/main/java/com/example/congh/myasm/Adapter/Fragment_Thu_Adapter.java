package com.example.congh.myasm.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.congh.myasm.Fragment.Thu.Fragment_Thu_Khoanthu;
import com.example.congh.myasm.Fragment.Thu.Fragment_Thu_LoaiThu;

import static com.example.congh.myasm.Fragment.Thu.Fragment_Thu.int_items;


public class  Fragment_Thu_Adapter extends FragmentPagerAdapter {

    public  Fragment_Thu_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment_Thu_LoaiThu();
            case 1:
                return new Fragment_Thu_Khoanthu();
        }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Loại thu";
            case 1:
                return "Khoản thu";
        }
        return null;
    }
}
