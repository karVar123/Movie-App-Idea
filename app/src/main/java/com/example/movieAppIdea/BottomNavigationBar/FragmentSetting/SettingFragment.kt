package com.example.movieAppIdea.BottomNavigationBar.FragmentSetting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.RecyclerView.FirstRecyclerViewAdapterOfSearchFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.RecyclerView.SecondRecyclerViewAdapterOfSearchActivity
import com.example.movieAppIdea.R

class SettingFragment : Fragment() {
    private val movieImagesForSearchFragmentRecyclerView1 = arrayListOf(
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
    )
    private val movieImagesForSearchFragmentRecyclerView2 = arrayListOf(
        R.drawable.movie__1,
        R.drawable.movie__2,
        R.drawable.movie__3,
        R.drawable.movie__4,
        R.drawable.movie__5,
        R.drawable.movie__6,
        R.drawable.movie__7,
        R.drawable.movie__1,
        R.drawable.movie__2,
        R.drawable.movie__3,
        R.drawable.movie__4,
        R.drawable.movie__5,
        R.drawable.movie__6,
        R.drawable.movie__7,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }




    companion object {
        @JvmStatic
        fun newInstance() =
            SettingFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}