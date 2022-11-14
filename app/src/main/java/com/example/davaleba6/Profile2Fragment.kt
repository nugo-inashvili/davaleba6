package com.example.davaleba6

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Profile2Fragment: Fragment(R.layout.profile_fragment_2) {
    private lateinit var returnButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        returnButton=view.findViewById(R.id.returnButton3)
        returnButton.setOnClickListener {
            val action=Profile2FragmentDirections.actionProfile2FragmentToProfile1Fragment()
            findNavController().navigate(action)
        }
    }
}