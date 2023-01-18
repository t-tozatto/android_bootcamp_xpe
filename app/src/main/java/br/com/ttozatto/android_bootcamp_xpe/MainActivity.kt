package br.com.ttozatto.android_bootcamp_xpe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "extra_message_view";
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        var intent = Intent(this, ShowMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, findViewById<EditText>(R.id.etMessage).text.toString())
        }

        startActivity(intent)
    }
}