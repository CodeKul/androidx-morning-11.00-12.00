package com.melayer.action_call

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Permissions {

    companion object{
    val REQUEST_ID_MULTIPLE_PERMISSIONS = 1

    public fun checkAndRequestPermissions(context: Context): Boolean {
        val phone = ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE)
        val location = ContextCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_FINE_LOCATION)
        val locationCoarse =
            ContextCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_COARSE_LOCATION)
        val network =
            ContextCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_NETWORK_STATE)
        val camera=ContextCompat.checkSelfPermission(context,android.Manifest.permission.CAMERA)
        val storage=ContextCompat.checkSelfPermission(context,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        val listPermissionsNeeded: ArrayList<String> = ArrayList()

        if (phone != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.CALL_PHONE)
        }

        if (location != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.ACCESS_FINE_LOCATION)
        }

        if (locationCoarse != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.ACCESS_COARSE_LOCATION)
        }

        if (network != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.ACCESS_NETWORK_STATE)
        }
        if (camera != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.CAMERA)
        }
        if (storage != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }


        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(
                context as Activity, listPermissionsNeeded.toTypedArray
                    (), REQUEST_ID_MULTIPLE_PERMISSIONS
            )
            return false
        }
        return true
    }
}
}