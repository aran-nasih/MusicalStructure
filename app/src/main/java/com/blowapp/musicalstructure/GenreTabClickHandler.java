package com.blowapp.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by Aran on 9/21/2017.
 */

public class GenreTabClickHandler implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(view.getContext(), GenreTabActivity.class);
        view.getContext().startActivity(intent);
    }
}
