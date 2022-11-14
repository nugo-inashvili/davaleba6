package com.example.davaleba6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment: Fragment(R.layout.dashboard_fragment) {
    private lateinit var text: TextView
    private lateinit var returnButton: Button
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text=view.findViewById(R.id.textView)
        val name=DashboardFragmentArgs.fromBundle(requireArguments()).name
        text.text=name
        returnButton=view.findViewById(R.id.returnButton)
        button=view.findViewById(R.id.button2)
        returnButton.setOnClickListener {
            val action=DashboardFragmentDirections.actionDashboardFragmentToHomeFragment()
            findNavController().navigate(action)
        }
        button.setOnClickListener {
            val action=DashboardFragmentDirections.actionDashboardFragmentToProfile1Fragment()
            findNavController().navigate(action)
        }
    }
}