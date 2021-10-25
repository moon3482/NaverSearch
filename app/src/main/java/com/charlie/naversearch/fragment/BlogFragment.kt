package com.charlie.naversearch.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.charlie.naversearch.databinding.BlogFragmentBinding

class BlogFragment : Fragment() {

    private val binding by lazy { BlogFragmentBinding.inflate(layoutInflater) }
    lateinit var reContext: Context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        reContext = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
}