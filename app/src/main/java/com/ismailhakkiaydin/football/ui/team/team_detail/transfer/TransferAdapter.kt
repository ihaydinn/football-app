package com.ismailhakkiaydin.football.ui.team.team_detail.transfer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.databinding.ItemTransferBinding
import com.ismailhakkiaydin.football.model.transfer.Transfer

class TransferAdapter(val transferList:List<Transfer>):RecyclerView.Adapter<TransferAdapter.TransferViewHolder>() {
    class TransferViewHolder(var view:ItemTransferBinding):RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransferViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemTransferBinding>(inflate, R.layout.item_transfer,parent,false)
        return TransferViewHolder(view)
    }

    override fun getItemCount(): Int = transferList.size

    override fun onBindViewHolder(holder: TransferViewHolder, position: Int) {
        holder.view.transfer = transferList[position]
    }
}