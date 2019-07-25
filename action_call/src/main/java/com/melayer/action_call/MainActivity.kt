package com.melayer.action_call

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents.Insert.ACTION
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall.setOnClickListener {

            checkValidation()


        }


    }

    private fun checkValidation() {

        if (edtPhone.text!!.isEmpty()){
            Toast.makeText(this@MainActivity,
                "Enter Phone Number",
                Toast.LENGTH_SHORT)
                .show()
        }
        else if(edtPhone.text.toString().length<10){
            Toast.makeText(this@MainActivity,
                "Enter Valid Phone Number",
                Toast.LENGTH_SHORT)
                .show()
        }
        else{
            if (Permissions.checkAndRequestPermissions(this@MainActivity)) {
                val callIntent=Intent(Intent.ACTION_CALL)
                callIntent.data = Uri.parse("tel:"+edtPhone.text.toString())
                startActivity(callIntent)
            } else {

            }
        }

    }
}
