package com.mikhail.parkapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FilmFragment : Fragment() {

    private val viewModel: FilmViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.film_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val filmRecycler = view.findViewById<RecyclerView>(R.id.film_recycler)
        val adapter = FilmAdapter(viewModel.filmList)
        filmRecycler.layoutManager = LinearLayoutManager(requireContext())
        filmRecycler.adapter = adapter
    }
}