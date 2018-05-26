package com.reptil.panda.euphoria.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.reptil.panda.euphoria.Model.CurrencyModel
import com.reptil.panda.euphoria.R

import java.util.ArrayList

class CurrencyModelAdapter : RecyclerView.Adapter<CurrencyModelViewHolder>() {

    private val items = ArrayList<CurrencyModel>()

    fun setData(newItems: List<CurrencyModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CurrencyModelViewHolder, position: Int) {
        holder.showData(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_crypto, parent, false)

        return CurrencyModelViewHolder(view)
    }
}

