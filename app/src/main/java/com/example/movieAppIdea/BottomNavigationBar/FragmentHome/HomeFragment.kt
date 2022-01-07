package com.example.movieAppIdea.BottomNavigationBar.FragmentHome

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
import com.example.movieAppIdea.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

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
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        super.onViewCreated(binding.root, savedInstanceState)

        creatingRecyclerViews()


    }


    private fun addRecyclerViewForFirstRVHomeHorizontal(
        RView: RecyclerView,
        imagesList: ArrayList<Int>
    ) {
        RView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        RView.adapter =
            FirstRecyclerViewAdapterOfSearchFragment(imagesList)

    }

    private fun addRecyclerViewForFirstRVHomeSmallHorizontal(
        RView: RecyclerView,
        imagesList: ArrayList<Int>
    ) {

        RView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        RView.adapter =
            SecondRecyclerViewAdapterOfSearchActivity(imagesList)

    }

    private fun creatingRecyclerViews() {
        val recyclerViewInHomeFragment1 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_1)
        val recyclerViewInHomeFragment2 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_2)
        val recyclerViewInHomeFragment3 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_3)
        val recyclerViewInHomeFragment4 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_4)
        val recyclerViewInHomeFragment5 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_5)
        val recyclerViewInHomeFragment6 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_6)
        val recyclerViewInHomeFragment7 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_7)
        val recyclerViewInHomeFragment8 =
            view?.findViewById<RecyclerView>(R.id.recyclerViewInSearchFragment_8)

        addRecyclerViewForFirstRVHomeHorizontal(
            recyclerViewInHomeFragment1!!, movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment2!!, movieImagesForSearchFragmentRecyclerView3
        )

        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment3!!, movieImagesForSearchFragmentRecyclerView2
        )
        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment4!!, movieImagesForSearchFragmentRecyclerView3
        )
        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment5!!, movieImagesForSearchFragmentRecyclerView2
        )

        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment6!!, movieImagesForSearchFragmentRecyclerView3
        )
        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment7!!, movieImagesForSearchFragmentRecyclerView2
        )

        addRecyclerViewForFirstRVHomeSmallHorizontal(
            recyclerViewInHomeFragment8!!, movieImagesForSearchFragmentRecyclerView3
        )

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}