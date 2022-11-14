package com.example.davaleba6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController

class HomeFragment: Fragment(R.layout.home_fragment) {
    private lateinit var personNameEditText: EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        personNameEditText=view.findViewById(R.id.editTextTextPersonName)
        button=view.findViewById(R.id.button1)
        button.setOnClickListener {
            val text=personNameEditText.text.toString()
            val action=HomeFragmentDirections.actionHomeFragmentToDashboardFragment(text)
            findNavController().navigate(action)
        }
    }
}