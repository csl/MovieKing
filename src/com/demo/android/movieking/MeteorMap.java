package com.demo.android.movieking;  



 import java.util.List;  

    

import com.google.android.maps.MapActivity;  

import com.google.android.maps.MapController;  

import com.google.android.maps.MapView;  

import com.google.android.maps.MyLocationOverlay;  

import com.google.android.maps.Overlay;  


import android.app.AlertDialog;  

import android.content.Context;  

 import android.content.DialogInterface;  

import android.content.Intent;  

import android.location.Location;  

import android.location.LocationListener;  

import android.location.LocationManager;  

 import android.os.Bundle;  

 import android.provider.Settings;  

 import android.util.Log;  

 import android.widget.Toast;  

  

public class MeteorMap extends MapActivity implements LocationListener  

 {  

     private LocationManager locationManager;  
   private MapView mapView;  
    private MapController mapController;  
    private MyLocationOverlay mylayer;  
   private boolean enableTool;  

    /** Called when the activity is first created. */ 

    @Override 

    public void onCreate(Bundle savedInstanceState)   {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.meteormap);  
        findControl();  
    }  

   
    //����GPS�}�ҪA��
   private void init()  
    {  
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))  
        {  
 new AlertDialog.Builder(MeteorMap.this).setTitle("GPS�w��").setMessage("�z�|���}�ҩw��A�ȡA�n�e���]�w�����Ұʩw��A�ȶܡH")  
 .setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener()  
    {  
  public void onClick(DialogInterface dialog, int which)  
  {
 startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));  
                        }  
     }).setNegativeButton("Cancel", new DialogInterface.OnClickListener()  
    {  
  public void onClick(DialogInterface dialog, int which)  
    {  
  Toast.makeText(MeteorMap.this, "���}�ҩw��A�ȡA�L�k�ϥ�GPS�w��A��!!", Toast.LENGTH_SHORT).show();  
      }  
      }).show();  
    }  
 else 
        {  
  enableMyLocation();  
   enableTool = true;  
         }  
    }  
   
   
 private void findControl()  
     {  
 mapView = (MapView) findViewById(R.id.map);  
 mapView.setBuiltInZoomControls(true);  

  mapController = mapView.getController();  
  mapController.setZoom(17);  
  locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);  
  locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 0, MeteorMap.this);  
  locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, MeteorMap.this);  

    }  

   

    private void enableMyLocation()  
    {  
        // GPS�w���I  
        List<Overlay> overlays = mapView.getOverlays();  
        mylayer = new MyLocationOverlay(this, mapView);  
         mylayer.enableCompass();  //�}��ù�L
        mylayer.enableMyLocation();  
         mylayer.runOnFirstFix(new Runnable()  

         {  

  public void run()  
             {  
   mapController.animateTo(mylayer.getMyLocation());  
             }  
         });  
        overlays.add(mylayer);  
    }  

   

    @Override 
     protected void onResume()  
    {  
    super.onResume();  
    if (enableTool)  
        {  

 locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, MeteorMap.this);  
locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 0, MeteorMap.this);  

  mylayer.enableMyLocation();  
 mylayer.enableCompass();  
        }  
        else 
        {  
  init();  
         }  
     }  
    
    @Override 
    protected void onPause()  
    {  
        super.onPause();  
        if (enableTool)  
        {  

 locationManager.removeUpdates(MeteorMap.this);  
  mylayer.disableCompass();  
 mylayer.disableMyLocation();  
        }  
    }  

    @Override 
    protected boolean isRouteDisplayed()  
    {  
        // TODO Auto-generated method stub  
        return false;  
    }  

   @Override 
    public void onLocationChanged(Location location)  
    {  
       Log.v("map", location.toString());  
    }  

    @Override 
    public void onProviderDisabled(String provider)  
    {  
        // TODO Auto-generated method stub  
    }  

    @Override 
    public void onProviderEnabled(String provider)  
    {  
        // TODO Auto-generated method stub  
     }  

    @Override 

     public void onStatusChanged(String provider, int status, Bundle extras)  
    {  
         // TODO Auto-generated method stub  
    	
    	
    	
    }  
} 
