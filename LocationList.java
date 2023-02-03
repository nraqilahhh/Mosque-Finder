package com.example.mosquefinder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class LocationList extends ArrayAdapter<Location> {
    private Activity context;
    List<Location> locations;

    //Create constructor
    public LocationList(Activity context, List<Location> locations) {
        super(context, R.layout.list_layout, locations);
        this.context = context;
        this.locations = locations;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);

        Location location = locations.get(position);
        textViewName.setText(location.getLocationName());

        return listViewItem;
    }
}