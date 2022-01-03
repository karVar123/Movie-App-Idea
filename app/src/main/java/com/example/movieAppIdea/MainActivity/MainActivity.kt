package com.example.movieAppIdea.MainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.movieAppIdea.BottomNavigationBar.FragmentAccount.AccountFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentFavorite.FavoriteFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentHome.HomeFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.SearchFragment
import com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.SettingFragment
import com.example.movieAppIdea.R
import com.example.movieAppIdea.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNavigation: MeowBottomNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initialization()
        addFragment(SearchFragment.newInstance())
        bottomNavigation.show(0)
        bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.ic_search))
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_favorite))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_account))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_setting))
        bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                0 -> {
                    replaceFragment(SearchFragment.newInstance())
                }
                1 -> {
                    replaceFragment(FavoriteFragment.newInstance())
                }
                2 -> {
                    replaceFragment(HomeFragment.                                                                                       newInstance())
                }
                3 -> {
                    replaceFragment(AccountFragment.newInstance())
                }
                4 -> {
                    replaceFragment(SettingFragment.newInstance())
                }
                else -> {
                    replaceFragment(HomeFragment.newInstance())
                }
            }
        }
    }

    private fun initialization() {
        bottomNavigation = findViewById(R.id.bottomNavigation)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainer, fragment)
            .addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun addFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentContainer, fragment)
            .addToBackStack(Fragment::class.java.simpleName).commit()
    }
}