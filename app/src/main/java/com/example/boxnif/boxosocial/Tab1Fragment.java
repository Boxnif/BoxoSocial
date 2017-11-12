package com.example.boxnif.boxosocial;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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

import com.example.boxnif.boxosocial.OpenFragments.OpenImages;
import com.google.android.gms.common.data.DataBufferObserver;

import org.w3c.dom.Text;
 /**
 *7.
 */

public class Tab1Fragment extends Fragment implements Beobachter
{
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab1_fragment,container,false);

        TextView tv1 = (TextView) view.findViewById(R.id.tev1);
        tv1.setText(Html.fromHtml(getString(R.string.MaxMustermann)));
        reagiereAufAenderung(1);




        return view;
    }

    @Override
    public void reagiereAufAenderung(int i)
    {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        switch (i)
        {
            case 1:
                OpenImages io = new OpenImages();
                io.registriereBeobachter(Tab1Fragment.this);
                fragmentTransaction.replace(R.id.imageButtonLayout, io);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case 2:
                ImageButtonFragment ibf = new ImageButtonFragment();
                ibf.registriereBeobachter(Tab1Fragment.this);
                fragmentTransaction.replace(R.id.imageButtonLayout, ibf);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;



        }

    }
}