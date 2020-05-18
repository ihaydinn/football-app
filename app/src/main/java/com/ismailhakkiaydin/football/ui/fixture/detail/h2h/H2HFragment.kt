package com.ismailhakkiaydin.football.ui.fixture.detail.h2h

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager

import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.base.BaseVMFragment
import com.ismailhakkiaydin.football.model.fixture.Fixture
import com.ismailhakkiaydin.football.model.fixture.HomeTeam
import com.ismailhakkiaydin.football.util.Constant
import kotlinx.android.synthetic.main.fragment_fixture.*
import kotlinx.android.synthetic.main.fragment_h2_h.*

class H2HFragment : BaseVMFragment<H2HViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_h2_h, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var teamIds = arguments?.getParcelable<Fixture>(Constant.FIXTURE_TEAM_IDS)

        viewModel.getAllH2hItems(teamIds!!.homeTeam.teamİd, teamIds!!.awayTeam.teamİd)
        viewModel.h2hList.observe(viewLifecycleOwner, Observer {
            it?.let {
                rvDetailH2h.layoutManager = LinearLayoutManager(context)
                rvDetailH2h.adapter = H2hAdapter(it)
            }
        })

        viewModel.loadingH2h.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it){
                    rvDetailH2h.visibility = View.GONE
                    progressBarH2h.visibility = View.VISIBLE
                }else{
                    rvDetailH2h.visibility = View.VISIBLE
                    progressBarH2h.visibility = View.GONE
                }
            }
        })
    }

    override fun getViewModel(): Class<H2HViewModel> = H2HViewModel::class.java

}
