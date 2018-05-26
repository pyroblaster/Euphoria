package com.reptil.panda.euphoria

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reptil.panda.euphoria.Model.CurrencyModel
import com.reptil.panda.euphoria.ui.CurrencyModelAdapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private val adapter = CurrencyModelAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        crypto.adapter = adapter
        crypto.layoutManager = LinearLayoutManager(activity)

        val items = listOf<CurrencyModel>()
        adapter.setData(items) //podaci koje dobijes s neta
    }


    companion object {
        fun newInstance(): HomeFragment = HomeFragment()

    }
}