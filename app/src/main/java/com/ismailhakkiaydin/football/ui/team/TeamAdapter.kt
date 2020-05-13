package com.ismailhakkiaydin.football.ui.team

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.databinding.ItemTeamBinding
import com.ismailhakkiaydin.football.model.team.Team


class TeamAdapter(val teamList: List<Team>, val onItemClick: (Team)->Unit): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {
    class TeamViewHolder(var view:ItemTeamBinding):RecyclerView.ViewHolder(view.root) {
        fun bind(team: Team, onItemClick: (Team) -> Unit){
            itemView.setOnClickListener {
                onItemClick(team)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemTeamBinding>(inflate, R.layout.item_team, parent, false)
        return TeamViewHolder(view)
    }

    override fun getItemCount(): Int = teamList.size

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.view.team = teamList[position]
        holder.bind(teamList[position], onItemClick)
    }
}