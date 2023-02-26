package com.example.vk

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridview: GridView = findViewById<View>(R.id.call_members) as GridView
        //gridview.setAdapter(Member_adapter())
    }

    /** Called when the user touches the button */
    fun sendMessage(view: View) {
        val alert = AlertDialog.Builder(this)
        alert.setMessage("привет");
        alert.show();
    }
    fun exit(view: View) {
        finish();
        System.exit(0);
    }

    fun openMessages(view: View) {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        startActivity(intent)
    }
    fun changeIcon(view: View) {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        startActivity(intent)
    }
}



