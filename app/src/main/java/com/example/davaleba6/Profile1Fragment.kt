package com.example.davaleba6

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Profile1Fragment: Fragment(R.layout.profile_fragment_1) {
    private lateinit var returnButton: Button
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        returnButton=view.findViewById(R.id.returnButton2)
        button=view.findViewById(R.id.button3)
        returnButton.setOnClickListener {
            val action=Profile1FragmentDirections.actionProfile1FragmentToDashboardFragment()
            findNavController().navigate(action)
        }
        button.setOnClickListener {
            val action=Profile1FragmentDirections.actionProfile1FragmentToProfile2Fragment()
            findNavController().navigate(action)
        }
    }
}