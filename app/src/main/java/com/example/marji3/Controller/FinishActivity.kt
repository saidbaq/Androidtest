package com.example.marji3.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marji3.R
import com.example.marji3.Utilities.EXTRA_LEAGUE
import com.example.marji3.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Lookingfor $league $skill league near you..."
    }
}