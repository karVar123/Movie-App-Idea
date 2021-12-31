package com.example.movieAppIdea.BottomNavigationBar.FragmentSearch.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieAppIdea.R


class SecondRecyclerViewAdapterOfSearchActivity(private val testImage: ArrayList<Int>) :
    RecyclerView.Adapter<SecondRecyclerViewAdapterOfSearchActivity.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.second_recycle_view_for_search_fragment, parent, false)
        )

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
//        holder.movieImageForSecondRecycleViewSearchFragment?.setImageResource(testImage[position])
    }

    override fun getItemCount() = testImage.size

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val movieImageForSecondRecycleViewSearchFragment: ImageView? =
//            itemView?.findViewById(R.id.movieImageOSecondRecyclerViewItem)
    }
}
