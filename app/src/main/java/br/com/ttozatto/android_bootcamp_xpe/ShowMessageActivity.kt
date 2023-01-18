package br.com.ttozatto.android_bootcamp_xpe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ShowMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        findViewById<TextView>(R.id.tvMessage).apply {
            text = intent.getStringExtra(EXTRA_MESSAGE)
        }
    }

    fun backToMain(view: View){
        startActivity(Intent(this, MainActivity::class.java))
    }
}