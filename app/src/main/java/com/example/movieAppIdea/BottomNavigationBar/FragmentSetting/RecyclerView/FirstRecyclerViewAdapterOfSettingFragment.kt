package com.example.movieAppIdea.BottomNavigationBar.FragmentSetting.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.R
import kotlin.collections.ArrayList


class FirstRecyclerViewAdapterOfSettingFragment(private val testImage: ArrayList<Int>) :
    RecyclerView.Adapter<FirstRecyclerViewAdapterOfSettingFragment.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CarViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.search_fragment_recycler_view_item_horizontal, parent, false)
        )

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.movieImageForFirstRecycleViewSearchFragment.setImageResource(testImage[position])
    }

    override fun getItemCount() = testImage.size

    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImageForFirstRecycleViewSearchFragment: ImageView =
            itemView.findViewById(R.id.recyclerViewInSearchFragment_1)
    }
}
