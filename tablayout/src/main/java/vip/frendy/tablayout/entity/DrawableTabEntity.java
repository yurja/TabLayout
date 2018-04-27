package vip.frendy.tablayout.entity;

import android.content.Context;
import android.graphics.drawable.Drawable;

import vip.frendy.tablayout.listener.CustomTabEntity;

public class DrawableTabEntity implements CustomTabEntity {
    public String title;
    public Drawable selectedIcon;
    public Drawable unSelectedIcon;

    public DrawableTabEntity(String title, Drawable selectedIcon, Drawable unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public Drawable getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public Drawable getTabUnselectedIcon() {
        return unSelectedIcon;
    }
}
