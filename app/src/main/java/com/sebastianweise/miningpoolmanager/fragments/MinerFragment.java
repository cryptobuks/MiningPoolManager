package com.sebastianweise.miningpoolmanager.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.sebastianweise.miningpoolmanager.R;
import com.sebastianweise.miningpoolmanager.classes.MinerDashboard.MinerDashboard;
import com.sebastianweise.miningpoolmanager.classes.WorkerClass;
import com.sebastianweise.miningpoolmanager.services.DataService;

import java.util.ArrayList;

public class MinerFragment extends Fragment {
    private EditText addressText;
    private TextView responseView;
    private ProgressBar progressBar;
    private Button queryButton;
    private ListView listWorkers;
    private View view;

    private ArrayList<WorkerClass> workerListe = new ArrayList<>();

    public MinerFragment() {
        // Required empty public constructor
    }

    public static MinerFragment newInstance(String param1, String param2) {
        MinerFragment fragment = new MinerFragment();
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
        view = inflater.inflate(R.layout.fragment_miner, container, false);

        progressBar=(ProgressBar) view.findViewById(R.id.progressBar);
        responseView=(TextView) view.findViewById(R.id.responseView);
        addressText=(EditText) view.findViewById(R.id.addressText);
        queryButton=(Button) view.findViewById(R.id.queryButton);
        listWorkers=(ListView) view.findViewById(R.id.listWorkers);

        queryButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new fetchData().execute();
            }
        });

        return view;
    }

    class fetchData extends AsyncTask<Void, Void, String> {
        protected void onPreExecute() { progressBar.setVisibility(View.VISIBLE); }

        protected String doInBackground(Void... urls) { return DataService.getData("miner/" + addressText.getText().toString() + "/dashboard"); }

        protected void onPostExecute(String response) {
            progressBar.setVisibility(View.GONE);
            Log.i("INFO", response);
            responseView.setText(response);

            MinerDashboard dashboard = new Gson().fromJson(response, MinerDashboard.class);
            workerListe.addAll(dashboard.getData().getWorkers());
            ArrayAdapter<WorkerClass> adapter = new ArrayAdapter<>( view.getContext(), android.R.layout.simple_list_item_1, workerListe );
            listWorkers.setAdapter(adapter);
        }
    }
}
