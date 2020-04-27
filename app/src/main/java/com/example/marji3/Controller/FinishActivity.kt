package com.example.marji3.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marji3.Model.Player
import com.example.marji3.R
import com.example.marji3.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueTxt.text = "Lookingfor ${player.leauge} ${player.skill} league near you..."
    }
}