package com.thealteria.toastutil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import android.widget.AutoCompleteTextView;

import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import static android.content.ContentValues.TAG;

public class LatlngAddress {
    @SuppressLint("StaticFieldLeak")

    private void currentAddress(final Context context, LatLng latLng, final AutoCompleteTextView location) throws IOException {
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());
        List<Address> address;

        address = geocoder.getFromLocationName(location.getText().toString(), 5);
        try {
            if (address != null) {
                Address givenLocation = address.get(0);

                if (givenLocation != null) {

                    latLng = new LatLng(givenLocation.getLatitude(), givenLocation.getLongitude());
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "onResult: exc: " + e.getMessage());
        }
    }


}