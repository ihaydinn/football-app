package com.ismailhakkiaydin.football.ui.home.topscorer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.databinding.ItemTopScorersBinding
import com.ismailhakkiaydin.football.model.topscorer.Topscorer

class TopScorerAdapter(val topScorerList: List<Topscorer>): RecyclerView.Adapter<TopScorerAdapter.TopScorerViewHolder>() {
    class TopScorerViewHolder(var view: ItemTopScorersBinding): RecyclerView.ViewHolder(view.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopScorerViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemTopScorersBinding>(inflate, R.layout.item_top_scorers, parent, false)
        return TopScorerViewHolder(view)
    }

    override fun getItemCount(): Int = topScorerList.size

    override fun onBindViewHolder(holder: TopScorerViewHolder, position: Int) {
        holder.view.scorers = topScorerList[position]
    }

}