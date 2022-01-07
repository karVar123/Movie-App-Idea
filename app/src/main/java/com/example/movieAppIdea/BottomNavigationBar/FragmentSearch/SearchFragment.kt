package com.example.movieAppIdea.BottomNavigationBar.FragmentSearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.viewpager.widget.ViewPager
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.Fragments.CartoonFragmentSearch
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.Fragments.FilmsFragmentSearch
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.Fragments.FragmentsAdapterSearch.FragmentAdapter
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.Fragments.SerialsFragmentSearch
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.Fragments.TvChannelsFragmentSearch
import com.example.movieAppIdea.R
import com.example.movieAppIdea.databinding.FragmentSearchBinding
import com.google.android.material.tabs.TabLayout

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var fragmentAdapter: FragmentAdapter


    override fun onCreateView(
        inflater: LayoutInflater, view: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, view, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        super.onViewCreated(binding.root, savedInstanceState)

        initialization()

        val supportFragmentManager = activity?.supportFragmentManager
        fragmentAdapter = supportFragmentManager?.let { FragmentAdapter(it) }!!
        fragmentAdapter.addFragment(FilmsFragmentSearch(), "Films")
        fragmentAdapter.addFragment(SerialsFragmentSearch(), "Serials")
        fragmentAdapter.addFragment(CartoonFragmentSearch(), "Cartoons")
        fragmentAdapter.addFragment(TvChannelsFragmentSearch(), "TV-Channels")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)


    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SearchFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    private fun initialization() {
        viewPager = binding.fragmentViewPager
        tabLayout = binding.tabLayoutSearchFragment
    }


}