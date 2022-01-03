package com.example.movieAppIdea.BottomNavigationBar.FragmentAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView.FirstRecyclerViewAdapterOfSearchFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView.SecondRecyclerViewAdapterOfSearchActivity
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.SearchFragment
import com.example.movieAppIdea.R
import com.example.movieAppIdea.databinding.FragmentSearchBinding

class AccountFragment : Fragment() {
    private val movieImagesForSearchFragmentRecyclerView1 = arrayListOf(
        R.drawable.images,
        R.drawable.images,
        R.drawable.images,
        R.drawable.images,
        R.drawable.images,
        R.drawable.images,
        R.drawable.images,
    )
    private val movieImagesForSearchFragmentRecyclerView2 = arrayListOf(
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
//        R.drawable.the_imitation_game_image,
//        R.drawable.the_social_network,
//        R.drawable.the_imitation_game_image,
//        R.drawable.the_social_network,
//        R.drawable.the_imitation_game_image,
//        R.drawable.the_social_network,
//        R.drawable.the_imitation_game_image,
//        R.drawable.the_social_network,
//        R.drawable.the_imitation_game_image,
//        R.drawable.the_social_network,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.firstRecyclerViewInAccountFragment)
        val secondRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.secondRecyclerViewInAccountFragment)
        addRecyclerViewForFirstRVSearchFirst(
            firstRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForFirstRVSearchSecond(
            secondRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView2
        )


        /*firstRecyclerViewInSearchFragment?.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        firstRecyclerViewInSearchFragment?.adapter =
            FirstRecyclerViewAdapterOfSearchFragment(movieImagesForSearchFragmentRecyclerView1)
            */
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
            SecondRecyclerViewAdapterOfSearchActivity(imagesList)

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            AccountFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}