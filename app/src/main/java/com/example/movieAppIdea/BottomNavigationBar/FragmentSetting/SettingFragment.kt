package com.example.movieAppIdea.BottomNavigationBar.FragmentSetting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieAppIdea.R

class SettingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    companion object {

        fun newInstance() =
            SettingFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}