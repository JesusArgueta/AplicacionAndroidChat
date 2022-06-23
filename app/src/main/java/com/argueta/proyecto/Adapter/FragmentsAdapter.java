package com.argueta.proyecto.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.argueta.proyecto.Fragments.CalendarFragment;
import com.argueta.proyecto.Fragments.ChatsFragment;
import com.argueta.proyecto.Fragments.NewsFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new NewsFragment();
            case 2: return new CalendarFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title=null;
        if(position==0){
            title="CHATS";

        }
        if(position==1){
            title="NOTICIAS";

        }
        if(position==2){
            title="CALENDARIO";

        }
        return title;
    }
}
