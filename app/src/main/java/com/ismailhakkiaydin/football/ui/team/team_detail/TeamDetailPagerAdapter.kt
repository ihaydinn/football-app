package com.ismailhakkiaydin.football.ui.team.team_detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TeamDetailPagerAdapter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {

    private val teamFragmentList = ArrayList<Fragment>()
    private val teamFragmentTitleList = ArrayList<String>()

    override fun getPageTitle(position: Int): CharSequence? = teamFragmentTitleList[position]

    override fun getItem(position: Int): Fragment = teamFragmentList[position]

    override fun getCount(): Int = teamFragmentList.size

    fun addFragment(fragment: Fragment, title:String){
        teamFragmentList.add(fragment)
        teamFragmentTitleList.add(title)
    }

}