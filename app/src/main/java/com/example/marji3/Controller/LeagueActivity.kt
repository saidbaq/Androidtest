package com.example.marji3.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.marji3.Utilities.EXTRA_LEAGUE
import com.example.marji3.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenscClicked(view : View){
        womensLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view : View){
        mansLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view : View){
        mansLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }
    }
}