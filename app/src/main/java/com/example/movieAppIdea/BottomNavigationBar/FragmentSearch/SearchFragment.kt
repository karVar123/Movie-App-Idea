package com.example.movieAppIdea.BottomNavigationBar.FragmentSearch

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
import com.example.movieAppIdea.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    lateinit var binding: FragmentSearchBinding
    private val movieImagesForSearchFragmentRecyclerView1 = arrayListOf(
        R.drawable.horizontal_movies__2,
        R.drawable.horizontal_movies__3,
        R.drawable.horizontal_movies__1,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__2,
        R.drawable.horizontal_movies__3,
        R.drawable.horizontal_movies__4,
        R.drawable.horizontal_movies__1,

        )

    private val movieImagesForSearchFragmentRecyclerView2 = arrayListOf(
        R.drawable.movie__5,
        R.drawable.movie__4,
        R.drawable.movie__1,
        R.drawable.movie__7,
        R.drawable.movie__2,
        R.drawable.movie__6,
        R.drawable.movie__3,
        R.drawable.movie__5,
        R.drawable.movie__4,
        R.drawable.movie__3,
        R.drawable.movie__2,
        R.drawable.movie__1,
        R.drawable.movie__7,
        R.drawable.movie__6,

        )

    private val movieImagesForSearchFragmentRecyclerView3 = arrayListOf(
        R.drawable.movie__2,
        R.drawable.movie__3,
        R.drawable.movie__1,
        R.drawable.movie__4,
        R.drawable.movie__6,
        R.drawable.movie__5,
        R.drawable.movie__1,
        R.drawable.movie__7,
        R.drawable.movie__2,
        R.drawable.movie__4,
        R.drawable.movie__5,
        R.drawable.movie__3,
        R.drawable.movie__6,
        R.drawable.movie__7,

        )

    override fun onCreateView(
        inflater: LayoutInflater, view: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, view, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        super.onViewCreated(binding.root, savedInstanceState)

        creatingRecyclerViews()


    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SearchFragment().apply {
                arguments = Bundle().apply {}
            }
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
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        RView.adapter =
            SecondRecyclerViewAdapterOfSearchActivity(imagesList)

    }

    private fun creatingRecyclerViews() {
        val recyclerViewInSearchFragment1 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_1)
        val recyclerViewInSearchFragment2 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_2)
        val recyclerViewInSearchFragment3 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_3)
        val recyclerViewInSearchFragment4 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_4)
        val recyclerViewInSearchFragment5 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_5)
        val recyclerViewInSearchFragment6 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_6)
        val recyclerViewInSearchFragment7 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_7)
        val recyclerViewInSearchFragment8 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_8)

        addRecyclerViewForFirstRVSearchFirst(
            recyclerViewInSearchFragment1!!, movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment2!!, movieImagesForSearchFragmentRecyclerView3
        )

        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment3!!, movieImagesForSearchFragmentRecyclerView2
        )
        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment4!!, movieImagesForSearchFragmentRecyclerView3
        )
        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment5!!, movieImagesForSearchFragmentRecyclerView2
        )

        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment6!!, movieImagesForSearchFragmentRecyclerView3
        )
        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment7!!, movieImagesForSearchFragmentRecyclerView2
        )

        addRecyclerViewForFirstRVSearchSecond(
            recyclerViewInSearchFragment8!!, movieImagesForSearchFragmentRecyclerView3
        )

    }
}