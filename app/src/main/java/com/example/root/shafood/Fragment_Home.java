package com.example.root.shafood;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Fragment_Home extends Fragment {
    private FirebaseAuth mAuth;
 private Button btnCariPenerima;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment__home, container, false);
        btnCariPenerima = (Button) view.findViewById(R.id.buttonKirim);
        mAuth = FirebaseAuth.getInstance();

        btnCariPenerima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent mIntent = new Intent(getActivity(), MainActivity.class);
                startActivity(mIntent);
            }
        });
        return view;
    }
}
