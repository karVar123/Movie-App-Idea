package com.example.movieAppIdea.BottomNavigationBar.FragmentSetting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.BottomNavigationBar.FragmentAccount.AccountFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView.FirstRecyclerViewAdapterOfSearchFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView.SecondRecyclerViewAdapterOfSearchActivity
import com.example.movieAppIdea.R

class SettingFragment : Fragment() {
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
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
        R.drawable.the_imitation_game_image,
        R.drawable.the_social_network,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_setting, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.firstRecyclerViewInSettingFragment)
        val secondRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.secondRecyclerViewInSettingFragment)
        val thirdRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.thirdRecyclerViewInSearchFragment)
        val fourthRecyclerViewInSearchFragment =
            view.findViewById<RecyclerView>(R.id.fourthRecyclerViewInSearchFragment)
        addRecyclerViewForFirstRVSearchFirst(
            firstRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForRVSearchSecond(
            secondRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView2
        )
        addRecyclerViewForRVSearchSecond(
            thirdRecyclerViewInSearchFragment,
            movieImagesForSearchFragmentRecyclerView1
        )
        addRecyclerViewForRVSearchSecond(
            fourthRecyclerViewInSearchFragment,
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

    private fun addRecyclerViewForRVSearchSecond(
        RView: RecyclerView,
        imagesList: ArrayList<Int>
    ) {
        RView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        RView.adapter =
            FirstRecyclerViewAdapterOfSearchFragment(imagesList)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SettingFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}