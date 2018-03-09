package com.astuetz.viewpager.extensions.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Seungjin on 2018-03-09.
 */

public class FragInner extends Fragment implements View.OnClickListener{

    Button btnLogin;
    Button btnLogout;
    EditText etID;

    public FragInner() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.layout_inner, container, false);

        return rootview;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        etID = (EditText)getView().findViewById(R.id.etID);
        btnLogin = (Button)getView().findViewById(R.id.btn_login);
        btnLogout = (Button)getView().findViewById(R.id.btn_logout);
        btnLogin.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btnLogin) {
            Toast.makeText(getActivity(), "FragInner - onClick() : Login", Toast.LENGTH_SHORT).show();
            Toast.makeText(getActivity(), etID.getText(), Toast.LENGTH_SHORT).show();
        }
        else if(view == btnLogout)
            Toast.makeText(getActivity(), "FragInner - onClick() : Logout", Toast.LENGTH_SHORT).show();
    }


}
