package br.com.ttozatto.android_bootcamp_xpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        findViewById<TextView>(R.id.tvMessage).apply {
            text = intent.getStringExtra(EXTRA_MESSAGE)
        }
    }
}