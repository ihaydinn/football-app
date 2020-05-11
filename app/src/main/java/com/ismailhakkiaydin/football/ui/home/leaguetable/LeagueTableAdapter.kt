package com.ismailhakkiaydin.football.ui.home.leaguetable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.databinding.ItemLeagueTableBinding
import com.ismailhakkiaydin.football.model.leaguetable.LeagueTableResponse
import com.ismailhakkiaydin.football.model.leaguetable.Standing

class LeagueTableAdapter(val leagueTableList: List<List<Standing>>, val onItemClick:(Standing) -> Unit):RecyclerView.Adapter<LeagueTableAdapter.LeagueTableViewHolder>() {
    class LeagueTableViewHolder(var view : ItemLeagueTableBinding):RecyclerView.ViewHolder(view.root) {
        fun bind(standing: Standing, onItemClick: (Standing) -> Unit){
            itemView.setOnClickListener {
                onItemClick(standing)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueTableViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemLeagueTableBinding>(inflate, R.layout.item_league_table, parent, false)
        return LeagueTableViewHolder(view)
    }

    override fun getItemCount(): Int = leagueTableList.size

    override fun onBindViewHolder(holder: LeagueTableViewHolder, position: Int) {
        holder.view.table = leagueTableList[0][position]
        holder.bind(leagueTableList[position][position],onItemClick)
    }

}