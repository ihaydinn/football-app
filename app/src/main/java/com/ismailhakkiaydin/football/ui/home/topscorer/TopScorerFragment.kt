package com.ismailhakkiaydin.football.ui.home.topscorer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager

import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.base.BaseVMFragment
import com.ismailhakkiaydin.football.ui.home.leaguetable.LeagueTableAdapter
import com.ismailhakkiaydin.football.util.CustomSharedPreferences
import kotlinx.android.synthetic.main.fragment_league_table.*
import kotlinx.android.synthetic.main.fragment_top_scorer.*

class TopScorerFragment : BaseVMFragment<TopScorerViewModel>() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top_scorer, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var customPreferences = CustomSharedPreferences(activity?.applicationContext!!)
        val leagueId = customPreferences.getCountryId()

        viewModel.getTopScorers(leagueId!!)
        viewModel.topScorerList.observe(viewLifecycleOwner, Observer {
            it?.let {
                rvTopScorers?.layoutManager = LinearLayoutManager(this.context)
                rvTopScorers?.adapter = TopScorerAdapter(it)
            }
        })

    }

    override fun getViewModel(): Class<TopScorerViewModel> = TopScorerViewModel::class.java

}
