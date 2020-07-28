package com.mundobinario.subenbajanaforobus.ui.aforo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.mundobinario.subenbajanaforobus.R;

public class AforoFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_aforos, container, false);

        // manejo del floatingButton:
        FloatingActionButton fab = root.findViewById(R.id.floatingActionButton_addAforo);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"abrir fragment añadir aforo", BaseTransientBottomBar.LENGTH_SHORT).
                        setAction("Action",null).show();
            }
        });
        // fin del manejo del floatingButton

        return root;
    }
}