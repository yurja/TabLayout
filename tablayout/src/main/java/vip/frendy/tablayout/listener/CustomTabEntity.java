package vip.frendy.tablayout.listener;

import android.graphics.drawable.Drawable;

public interface CustomTabEntity {
    String getTabTitle();

    Drawable getTabSelectedIcon();

    Drawable getTabUnselectedIcon();
}