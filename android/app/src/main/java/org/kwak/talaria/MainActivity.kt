package org.kwak.talaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

external fun hello(to: String): String

fun loadTestLib() {
    System.loadLibrary("test_lib")
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load Rust
        loadTestLib()
        findViewById<TextView>(R.id.txtMessage).let {
            it?.text =  hello("Talaria")
        }
    }
}