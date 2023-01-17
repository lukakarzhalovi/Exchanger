package com.example.exchanger

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class pay_fragment : Fragment(R.layout.fragment_pay) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text : TextView = view.findViewById(R.id.Name)
        val Id : TextView = view.findViewById(R.id.ID)
        val image :ImageView = view.findViewById(R.id.imageView4)
        val args = this.arguments
        val inputId = args?.get("Id")
        val inputText = args?.get("name")
        val inputImage = args?.getInt("image")
        Id.text = inputId.toString()
        text.text = inputText.toString()
        if (inputImage != null) {
            image.setImageResource(inputImage)
        }
    }
}