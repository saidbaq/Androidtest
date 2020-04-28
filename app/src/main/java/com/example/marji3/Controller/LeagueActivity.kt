package com.example.marji3.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.marji3.Model.Player
import com.example.marji3.R
import com.example.marji3.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player?>(EXTRA_PLAYER)!!
        }
    }
    fun onMenscClicked(view : View){
        womensLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.leauge = "mens"
    }

    fun onWomensClicked(view : View){
        mansLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.leauge = "womens"
    }

    fun onCoedClicked(view : View){
        mansLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.leauge = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (player.leauge != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }
    }
}