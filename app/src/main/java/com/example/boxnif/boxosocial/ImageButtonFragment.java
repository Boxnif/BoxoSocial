package com.example.boxnif.boxosocial;

import android.app.Dialog;
import android.content.Context;
import android.database.Observable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.common.data.DataBufferObserver;

import java.util.ArrayList;
import java.util.List;


public class ImageButtonFragment extends Fragment implements Beobachtbar
{
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }
    private List<Beobachter> _alleBeobachter = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {


        View view = inflater.inflate(R.layout.image_button_fragment,container,false);
            final ImageButton closeButton = (ImageButton) view.findViewById(R.id.closeButton1);
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

            closeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    informiere();
                    Log.e("Something","Happend");
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


    @Override
    public void registriereBeobachter(Beobachter beobachter)
    {
        _alleBeobachter.add(beobachter);
    }

    @Override
    public void informiere()
    {
        for(Beobachter beobachter: _alleBeobachter)
        {
            beobachter.reagiereAufAenderung(1);
        }
    }
}
