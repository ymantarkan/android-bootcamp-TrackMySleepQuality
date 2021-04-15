package com.example.database_and_recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.database_and_recyclerview.databinding.FragmentTrackEmotionBinding


class TrackEmotion : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTrackEmotionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_track_emotion, container, false)

        return  binding.root
    }


}