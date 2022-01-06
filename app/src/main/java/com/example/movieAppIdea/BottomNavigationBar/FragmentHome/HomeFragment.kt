package com.example.movieAppIdea.BottomNavigationBar.FragmentHome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.RecyclerView.FirstRecyclerViewAdapterOfSearchFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.RecyclerView.SecondRecyclerViewAdapterOfSettingActivity
import com.example.movieAppIdea.R

class HomeFragment : Fragment() {
    private val movieImagesForSearchFragmentRecyclerView1 = arrayListOf(
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__4,
//        R.drawable.images,
//        R.drawable.images,
//        R.drawable.images,
//        R.drawable.images,
//        R.drawable.images,
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_1)
        val secondRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_2)
        addRecyclerViewForFirstRVSearchFirst(
            firstRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForFirstRVSearchSecond(
            secondRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView2
        )


    }


    private fun addRecyclerViewForFirstRVSearchFirst(
        RView: RecyclerView,
        imagesList: ArrayList<Int>
    ) {

        RView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        RView.adapter =
            FirstRecyclerViewAdapterOfSearchFragment(imagesList)

    }

    private fun addRecyclerViewForFirstRVSearchSecond(
        RView: RecyclerView,
        imagesList: ArrayList<Int>
    ) {

        RView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        RView.adapter =
            SecondRecyclerViewAdapterOfSettingActivity(imagesList)

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}