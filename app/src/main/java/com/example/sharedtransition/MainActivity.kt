package com.example.sharedtransition

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile_layout.setOnClickListener {
            var intent = Intent(this,DetailsActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this,
                android.util.Pair(personImage,personImage.transitionName),
                android.util.Pair(personName,personName.transitionName),
                android.util.Pair(personOccupation,personOccupation.transitionName)).toBundle())

        }
    }
}
