package com.internsavyInternee.playingsound

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val mediaPlayer = MediaPlayer.create(this, R.raw.sound)

        button.setOnClickListener {
            val lottieView = findViewById<LottieAnimationView>(R.id.lottie)
            lottieView.playAnimation()
            mediaPlayer.start()
        }
    }
}