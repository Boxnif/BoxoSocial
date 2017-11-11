package com.example.boxnif.boxosocial;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Kami on 03.11.2017.
 */

public class Tab1Fragment extends Fragment
{
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        final DisplayMetrics displaymetrics = new DisplayMetrics();
        //getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        TextView tv1 = (TextView) view.findViewById(R.id.tev1);
        tv1.setText(Html.fromHtml(getString(R.string.MaxMustermann)));
        final ImageButton ib1 = (ImageButton) view.findViewById(R.id.ib1);
        final ImageButton ib2 = (ImageButton) view.findViewById(R.id.ib2);
        final ImageButton ibi1 = (ImageButton) view.findViewById(R.id.ibi1);
        final ImageButton ibi2 = (ImageButton) view.findViewById(R.id.ibi2);
        final ImageButton ibi3 = (ImageButton) view.findViewById(R.id.ibi3);
        final ImageButton ibi4 = (ImageButton) view.findViewById(R.id.ibi4);
        final ImageButton ibi5 = (ImageButton) view.findViewById(R.id.ibi5);
        final ImageButton ibi6 = (ImageButton) view.findViewById(R.id.ibi6);
        final ImageButton ibi7 = (ImageButton) view.findViewById(R.id.ibi7);
        final ImageButton ibi8 = (ImageButton) view.findViewById(R.id.ibi8);
        final ImageButton ibi9 = (ImageButton) view.findViewById(R.id.ibi9);
        final LinearLayout llh1 = (LinearLayout) view.findViewById(R.id.llh1);
        final LinearLayout llh2 = (LinearLayout) view.findViewById(R.id.llh2);
        final LinearLayout llh3 = (LinearLayout) view.findViewById(R.id.llh3);
        ib2.setVisibility(View.INVISIBLE);
        llh1.setVisibility(View.INVISIBLE);
        llh2.setVisibility(View.INVISIBLE);
        llh3.setVisibility(View.INVISIBLE);

        /*
        * ruft hinterlegetws  xy auf
        *
        *
        * */
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib1.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                params.topMargin = -40;
                ib1.setLayoutParams(params);
                ib2.setVisibility(View.VISIBLE);
                llh1.setVisibility(View.VISIBLE);
                llh2.setVisibility(View.VISIBLE);
                llh3.setVisibility(View.VISIBLE);

            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib1.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        51);
                params.topMargin = 40;
                ib1.setLayoutParams(params);
                ib2.setVisibility(View.INVISIBLE);
                ib2.setVisibility(View.INVISIBLE);
                llh1.setVisibility(View.INVISIBLE);
                llh2.setVisibility(View.INVISIBLE);
                llh3.setVisibility(View.INVISIBLE);
            }
        });
        ibi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.custom);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.rubix);
                dialog.show();
            }
        });
        ibi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.custom);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.wolf);
                dialog.show();
            }
        });
        ibi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.custom);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.cat);
                dialog.show();
            }
        });
        return view;
    }
}