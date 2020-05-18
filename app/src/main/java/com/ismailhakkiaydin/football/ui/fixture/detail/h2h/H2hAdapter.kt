package com.ismailhakkiaydin.football.ui.fixture.detail.h2h

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.databinding.ItemH2hBinding
import com.ismailhakkiaydin.football.model.h2h.Fixture

class H2hAdapter(val h2hList: List<Fixture>): RecyclerView.Adapter<H2hAdapter.H2hViewHolder>() {
    class H2hViewHolder(var view : ItemH2hBinding):RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): H2hViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemH2hBinding>(inflate, R.layout.item_h2h, parent ,false)
        return H2hViewHolder(view)
    }

    override fun getItemCount(): Int = h2hList.size

    override fun onBindViewHolder(holder: H2hViewHolder, position: Int) {
        holder.view.h2h = h2hList[position]
    }
}