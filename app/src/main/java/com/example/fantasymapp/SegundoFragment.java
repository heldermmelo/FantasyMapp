package com.example.fantasymapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SegundoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle estadoSalvoInstancia){
        return inflater.inflate(R.layout.segundo_frag, container, false);
    }
}
