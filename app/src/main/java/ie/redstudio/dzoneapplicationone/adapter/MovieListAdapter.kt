package ie.redstudio.dzoneapplicationone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.redstudio.dzoneapplicationone.R
import ie.redstudio.dzoneapplicationone.data.Movie
import kotlinx.android.synthetic.main.rowmovies.view.*

class MovieListAdapter(private val context: Context?, private val movieList:ArrayList<Movie>):RecyclerView.Adapter<MovieListAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val no = view.no
        val name = view.name
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListAdapter.ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rowmovies, parent, false))
    }


    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieListAdapter.ViewHolder, position: Int) {
        holder.no?.text=movieList.get(position).id.toString()
        holder.name?.text=movieList.get(position).name
    }

}