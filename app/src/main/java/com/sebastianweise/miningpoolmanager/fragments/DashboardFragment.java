package com.sebastianweise.miningpoolmanager.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.sebastianweise.miningpoolmanager.R;
import com.sebastianweise.miningpoolmanager.classes.PoolStats.PoolStats;
import com.sebastianweise.miningpoolmanager.services.DataService;

public class DashboardFragment extends Fragment {
    private TextView infotextbtc;
    private TextView infotextusd;
    private ProgressBar progressBar;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        progressBar=(ProgressBar) view.findViewById(R.id.progressBar);
        infotextbtc=(TextView) view.findViewById(R.id.info_text_btc);
        infotextusd=(TextView) view.findViewById(R.id.info_text_usd);

        new fetchData().execute();

        return view;
    }

    class fetchData extends AsyncTask<Void, Void, String> {
        protected void onPreExecute() { progressBar.setVisibility(View.VISIBLE); }

        protected String doInBackground(Void... urls) {
            return DataService.getData("poolStats");
        }

        protected void onPostExecute(String response) {
            PoolStats poolStats = new Gson().fromJson(response, PoolStats.class);

            progressBar.setVisibility(View.GONE);
            infotextbtc.setText(poolStats.getData().getPrice().getBtc().toString());
            infotextusd.setText(poolStats.getData().getPrice().getUsd().toString());
        }
    }
}
