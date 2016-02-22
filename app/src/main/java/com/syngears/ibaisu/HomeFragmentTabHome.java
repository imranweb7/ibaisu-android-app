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
public class HomeFragmentTabHome extends Fragment implements View.OnClickListener {

    Button btn_nav_home_tab_home_about, btn_nav_home_tab_home_why_study_here, btn_nav_home_tab_home_our_resources;

    public HomeFragmentTabHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment_tab_home, container, false);

        btn_nav_home_tab_home_about = (Button) view.findViewById(R.id.nav_home_tab_home_about);
        btn_nav_home_tab_home_about.setOnClickListener(this);

        btn_nav_home_tab_home_why_study_here = (Button) view.findViewById(R.id.nav_home_tab_home_why_study_here);
        btn_nav_home_tab_home_why_study_here.setOnClickListener(this);

        btn_nav_home_tab_home_our_resources = (Button) view.findViewById(R.id.nav_home_tab_home_our_resources);
        btn_nav_home_tab_home_our_resources.setOnClickListener(this);

        return view;
    }

    public void showNavHomeTabHomeAbout(View v)
    {
        ((MainActivity)getActivity()).openFragment(new TabHomeAboutIbaisuFragment());
    }

    public void showNavHomeTabHomeWhyStudyHere(View v)
    {
        Toast.makeText(getActivity(), "Clicked on Button2", Toast.LENGTH_LONG).show();
    }

    public void showNavHomeTabHomeOurResources(View v)
    {
        Toast.makeText(getActivity(), "Clicked on Button3", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nav_home_tab_home_about:
                showNavHomeTabHomeAbout(view);
                break;

            case R.id.nav_home_tab_home_why_study_here:
                showNavHomeTabHomeWhyStudyHere(view);
                break;

            case R.id.nav_home_tab_home_our_resources:
                showNavHomeTabHomeOurResources(view);
                break;

            default:
                break;
        }
    }

}
