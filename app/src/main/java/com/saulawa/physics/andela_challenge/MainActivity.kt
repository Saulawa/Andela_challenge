package com.saulawa.physics.andela_challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        aboutandela.setOnClickListener {

            startActivity(Intent(this,Profile::class.java))

        }

        profile.setOnClickListener {

            startActivity(Intent(this,ActivityB::class.java))
        }
    }
}
