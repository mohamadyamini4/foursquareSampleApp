package com.example.mohammad.samplemyapp.Activities;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.Present.PresenterImps.FetchListPresenterImpl;
import com.example.mohammad.samplemyapp.Present.PresenterImps.LocationManagerPresenterImpl;
import com.example.mohammad.samplemyapp.R;
import com.example.mohammad.samplemyapp.View.Adapter.PlaceRecyclerAdapter;
import com.example.mohammad.samplemyapp.View.View;
import com.example.mohammad.samplemyapp.object.Venue;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.ViewLocationManager, View.fetchListManager {

    public static String TAG = Main2Activity.class.getSimpleName();
    private Presenter.fetchList fetchList;
    private PlaceRecyclerAdapter placeRecyclerAdapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();

    }

    private void init() {
        LocationManagerPresenterImpl.getInstance(this).getLocation();
        recyclerView = findViewById(R.id.my_recycler_view);
        fetchList = new FetchListPresenterImpl(this);
        placeRecyclerAdapter = new PlaceRecyclerAdapter(this, null);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }

    @Override
    public void receiveLocation(Location location) {
        if (location!=null)
            fetchList.getList(location);
    }

    @Override
    public void receiveList(ArrayList<Venue> venues) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        if (venues != null && venues.size() > 0) {
            placeRecyclerAdapter.setData(venues);
            placeRecyclerAdapter.notifyDataSetChanged();
            recyclerView.setAdapter(placeRecyclerAdapter);
        }
    }

    @Override
    public void onreceiveListErr() {

    }
}
