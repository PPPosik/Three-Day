package com.example.khj_pc.threeday

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread{
            kotlin.run {
                Thread.sleep(1500)

                val intent = Intent(this@SplashActivity, TexActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}