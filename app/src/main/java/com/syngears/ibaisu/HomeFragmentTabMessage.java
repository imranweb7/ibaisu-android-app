package com.syngears.ibaisu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragmentTabMessage extends Fragment implements View.OnClickListener{

    Button btn_nav_home_tab_message_from_chairman,
            btn_nav_home_tab_message_from_vice_chairman,
            btn_nav_home_tab_message_from_vc;

    public HomeFragmentTabMessage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment_tab_message, container, false);

        btn_nav_home_tab_message_from_chairman = (Button) view.findViewById(R.id.nav_home_tab_message_from_chairman);
        btn_nav_home_tab_message_from_chairman.setOnClickListener(this);

        btn_nav_home_tab_message_from_vice_chairman = (Button) view.findViewById(R.id.nav_home_tab_message_from_vice_chairman);
        btn_nav_home_tab_message_from_vice_chairman.setOnClickListener(this);

        btn_nav_home_tab_message_from_vc = (Button) view.findViewById(R.id.nav_home_tab_message_from_vc);
        btn_nav_home_tab_message_from_vc.setOnClickListener(this);

        return view;
    }

    public void showNavHomeTabMessageFromChairman(View v)
    {
        Toast.makeText(getActivity(), "Clicked on Button1", Toast.LENGTH_LONG).show();
    }

    public void showNavHomeTabMessageFromViceChairman(View v)
    {
        Toast.makeText(getActivity(), "Clicked on Button2", Toast.LENGTH_LONG).show();
    }

    public void showNavHomeTabMessageFromVC(View v)
    {
        Toast.makeText(getActivity(), "Clicked on Button3", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nav_home_tab_message_from_chairman:
                showNavHomeTabMessageFromChairman(view);
                break;

            case R.id.nav_home_tab_message_from_vice_chairman:
                showNavHomeTabMessageFromViceChairman(view);
                break;

            case R.id.nav_home_tab_message_from_vc:
                showNavHomeTabMessageFromVC(view);
                break;

            default:
                break;
        }
    }

}
