package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Crypto : Fragment(R.layout.fragment_crypto) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var cryptolist: ArrayList<crypro_data>
    private lateinit var cryptoAdapter: cryptoAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        cryptolist = ArrayList()

        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"dolar"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"lari"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"lira"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"sterlingi"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"dolar"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"lari"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"lira"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"sterlingi"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"dolar"))
        cryptolist.add(crypro_data(R.drawable.ic_baseline_history_24,"lari"))

        cryptoAdapter =  cryptoAdapter(cryptolist)
        recyclerView.adapter = cryptoAdapter

    }

}