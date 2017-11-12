package com.example.boxnif.boxosocial.OpenFragments;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.boxnif.boxosocial.Beobachtbar;
import com.example.boxnif.boxosocial.Beobachter;
import com.example.boxnif.boxosocial.ImageButtonFragment;
import com.example.boxnif.boxosocial.R;
import com.example.boxnif.boxosocial.Tab1Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpenImages extends Fragment implements Beobachtbar
{
    private List<Beobachter> _alleBeobachter = new ArrayList<>();

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_open_images,container,false);
        final ImageButton ib1 = (ImageButton) view.findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                informiere();
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
            beobachter.reagiereAufAenderung(2);
        }
    }
}
