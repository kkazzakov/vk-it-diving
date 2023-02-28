package com.example.vk

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

val names = listOf("You", "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.members_list)
        recyclerView.adapter = CustomRecyclerAdapter(names)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //gridview.setAdapter(Member_adapter())
    }

    var mic = false
    var cam = false
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

    fun openContacts(view: View) {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_CONTACTS)
        startActivity(intent)
    }

    fun swapItems(view: View) {
        Collections.swap(names, 0, 1)
        val recyclerView: RecyclerView = findViewById(R.id.members_list)
        recyclerView.adapter = CustomRecyclerAdapter(names)

    }

    fun changeIcon(view: View) {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        startActivity(intent)
    }

     fun changeMicIcon(view: View) {
         if (!mic) {
             (view as ImageView).setImageResource(R.drawable.ic_baseline_mic_24)
             view.background.setTint(resources.getColor(R.color.vk_grey))
         }
         else {
             (view as ImageView).setImageResource(R.drawable.ic_baseline_mic_off_24)
             view.background.setTint(resources.getColor(R.color.white))
         }
         mic = !mic

     }

    fun changeCamIcon(view: View) {
        if (!cam) {
            (view as ImageView).setImageResource(R.drawable.ic_baseline_videocam_24)
            view.background.setTint(resources.getColor(R.color.vk_grey))
        }
        else {
            (view as ImageView).setImageResource(R.drawable.ic_baseline_videocam_off_24)
            view.background.setTint(resources.getColor(R.color.white))
        }
        cam = !cam

    }

}



