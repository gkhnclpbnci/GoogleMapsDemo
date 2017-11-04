package com.gkhnclpbnci.googlemapsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    // private static final float ZOOM_RATE = 15.0f ;
    //private double lat = -1, lng = -1;

    private GoogleMap mMap;
    //private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        /*startLocationManager();*/
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
        LatLng sydney = new LatLng(38.366125, 27.207569);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("İdeaktif"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));
        googleMap.getUiSettings().setZoomControlsEnabled(true);

       // mMap = googleMap;
      /*  LatLng iyte = new LatLng(38.318673, 26.639131);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        googleMap.setMyLocationEnabled(true);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iyte,13));
        googleMap.addMarker(new MarkerOptions()
        .title("İYTe")
        .snippet("Burası")
        .position(iyte));*/



/*
        // Add a marker in Sydney and move the camera
     //   LatLng sydney = new LatLng(-34, 151);
      //  mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

        Location location = getLastLocation();

        float errorRate = location.getAccuracy();

        Toast.makeText(this, "Hata payı : "+errorRate, Toast.LENGTH_SHORT).show();

        setMapCamera(location);*/

    }
    /*
    private void setMapCamera(Location location) {

        lat = location.getLatitude();


        lng = location.getLongitude();

        Toast.makeText(this, "lat:"+ lat, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "lng:"+ lng, Toast.LENGTH_SHORT).show();
//        Location myLocation = googleMap.getMyLocation();
        LatLng currentLatLng = new LatLng(lat, lng);
//        LatLng currentLatLng = new LatLng(myLocation.getLatitude(),myLocation.getLongitude());

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 15.0f));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(ZOOM_RATE), 2000, null);

    }
    */

   /* private Location getLastLocation() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return null;
        }
        LocationManager locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();

       Location location = locationManager.getLastKnownLocation(locationManager
               .getBestProvider(criteria, false));
        double latitude = location.getLatitude();
       double longitude = location.getLongitude();

     //   return locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
       return location;


    }
    */
    /*
    private void startLocationManager() {

        //TODO fix permission control
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling


            return;
        }

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);


        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                2000,
                10,  this);

    }

    @Override
    public void onLocationChanged(Location location) {

        setMapCamera(location);

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }*/
}
