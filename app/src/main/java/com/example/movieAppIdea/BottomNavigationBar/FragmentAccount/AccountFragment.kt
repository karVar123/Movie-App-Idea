package com.example.movieAppIdea.BottomNavigationBar.FragmentAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieAppIdea.R

class AccountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            AccountFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}