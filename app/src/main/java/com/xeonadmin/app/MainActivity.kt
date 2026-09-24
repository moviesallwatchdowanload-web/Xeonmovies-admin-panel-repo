package com.xeonadmin.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            android.widget.TextView(this).apply {
                text = "XeonAdmin"
                textSize = 28f
                gravity = android.view.Gravity.CENTER
            }
        )
    }
}
