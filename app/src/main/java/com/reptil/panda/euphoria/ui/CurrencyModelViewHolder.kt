package com.reptil.panda.euphoria.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import com.reptil.panda.euphoria.Model.CurrencyModel
import kotlinx.android.synthetic.main.item_crypto.view.*

class CurrencyModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun showData(currencyModel: CurrencyModel) = with(itemView){
        //todo add some data
        currencyName.text = currencyModel.name
        currencyId.text=currencyModel.id
        currencySymbol.text=currencyModel.symbol
        currencyRank.text=currencyModel.rank
        currencyMarketCapUsd.text=currencyModel.marketCapUsd
    }
}