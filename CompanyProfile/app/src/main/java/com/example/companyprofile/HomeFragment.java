package com.example.companyprofile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    ImageView ivlogo;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ivlogo = view.findViewById(R.id.iv_logo);
        ivlogo.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getActivity(), "Tes Tes Toast", Toast.LENGTH_LONG).show();
          }
        });

        return view;

        //kita perlu membuat variable terlebih dahuilu
        //konteks difragment menggunakan getActivity
    }

}
