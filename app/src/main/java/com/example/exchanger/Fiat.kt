package com.example.exchanger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fiat : Fragment(R.layout.fragment_fiat) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fiatlist: ArrayList<fiat_data>
    private lateinit var fiatAdapter: fiatAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        fiatlist = ArrayList()

        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"dolar"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"lari"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"lira"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"sterlingi"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"dolar"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"lari"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"lira"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"sterlingi"))
        fiatlist.add(fiat_data(R.drawable.ic_baseline_history_24,"dolar"))


        fiatAdapter =  fiatAdapter(fiatlist)
        recyclerView.adapter = fiatAdapter
    }

}