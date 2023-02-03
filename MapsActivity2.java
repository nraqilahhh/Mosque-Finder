package com.example.mosquefinder;

import androidx.fragment.app.FragmentActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mosquefinder.databinding.ActivityMaps2Binding;

import java.io.IOException;
import java.util.List;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Pusat_Islam_UiTM_Machang = new LatLng(5.7585, 102.2737);
        mMap.addMarker(new MarkerOptions().position(Pusat_Islam_UiTM_Machang ).title("Marker in Pusat Islam Uitm Machang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pusat_Islam_UiTM_Machang ));

        LatLng Masjid_Sultan_Yahya_Petra_Machang = new LatLng(5.7632, 102.2168);
        mMap.addMarker(new MarkerOptions().position(Masjid_Sultan_Yahya_Petra_Machang).title("Marker in Masjid Sultan Yahya Petra Machang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_Sultan_Yahya_Petra_Machang));

        LatLng Masjid_Mukim_Kampung_Belukar = new LatLng(5.7564, 102.2788);
        mMap.addMarker(new MarkerOptions().position(Masjid_Mukim_Kampung_Belukar).title("Marker in Masjid Mukim Kampung Belukar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_Mukim_Kampung_Belukar));

        LatLng Masjid_Ar_Raudhah = new LatLng(5.7596, 102.2917);
        mMap.addMarker(new MarkerOptions().position(Masjid_Ar_Raudhah).title("Marker in Masjid Ar-Raudhah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_Ar_Raudhah));

        LatLng Masjid_Al_Bakti = new LatLng(5.7564, 102.2786);
        mMap.addMarker(new MarkerOptions().position(Masjid_Al_Bakti).title("Marker in Masjid Al-Bakti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_Al_Bakti));

        LatLng Masjid_FELCRA_Teratak_Batu = new LatLng(5.7567, 102.3372);
        mMap.addMarker(new MarkerOptions().position(Masjid_FELCRA_Teratak_Batu).title("Marker in Masjid FELCRA Teratak Batu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_FELCRA_Teratak_Batu));

    }
    public void onMapSearch(View view) {
        EditText locationSearch= (EditText) findViewById(R.id.editText);
        String location = locationSearch.getText().toString();
        List<Address> addressList= null;

        if (location != null || !location.equals("")) {
            Geocoder geocoder= new Geocoder(this);
            try {
                addressList= geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address= addressList.get(0);
            LatLng latLng= new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18));
        }
    }
}