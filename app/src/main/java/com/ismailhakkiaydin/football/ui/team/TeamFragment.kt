package com.ismailhakkiaydin.football.ui.team

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager

import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.base.BaseVMFragment
import com.ismailhakkiaydin.football.util.CustomSharedPreferences
import kotlinx.android.synthetic.main.fragment_team.*

class TeamFragment : BaseVMFragment<TeamViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var customPreferences = CustomSharedPreferences(activity?.applicationContext!!)
        val leagueId = customPreferences.getCountryId()

        viewModel.getAllTeamsOfLeague(leagueId!!)
        viewModel.teamsList.observe(viewLifecycleOwner, Observer {
            it?.let {
                rvTeamsList.layoutManager = LinearLayoutManager(this.context)
                rvTeamsList.adapter = TeamAdapter(it){
                    Toast.makeText(context,"Tıklandı", Toast.LENGTH_SHORT).show()
                    val action = TeamFragmentDirections.actionTeamFragmentToTeamDetailFragment(it.teamİd)
                    Navigation.findNavController(view).navigate(action)
                }
            }
        })

        viewModel.loadingTeamList.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it){
                    rvTeamsList.visibility = View.GONE
                    progressBarTeamsList.visibility = View.VISIBLE
                }else{
                    rvTeamsList.visibility = View.VISIBLE
                    progressBarTeamsList.visibility = View.GONE
                }
            }
        })

    }

    override fun getViewModel(): Class<TeamViewModel> = TeamViewModel::class.java

}
