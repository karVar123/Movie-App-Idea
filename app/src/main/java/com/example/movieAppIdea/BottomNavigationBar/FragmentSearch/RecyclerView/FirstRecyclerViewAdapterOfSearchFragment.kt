package com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.R
import kotlin.collections.ArrayList


class FirstRecyclerViewAdapterOfSearchFragment(private val testImage: ArrayList<Int>) :
    RecyclerView.Adapter<FirstRecyclerViewAdapterOfSearchFragment.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CarViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.first_recycler_view_item_in_search_fragment, parent, false)
        )

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.movieImageForFirstRecycleViewSearchFragment.setImageResource(testImage[position])
    }

    override fun getItemCount() = testImage.size

    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImageForFirstRecycleViewSearchFragment: ImageView =
            itemView.findViewById(R.id.firstRecyclerViewInSearchFragment)
    }
}
