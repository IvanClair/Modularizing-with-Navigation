package personal.ivan.navigationpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import personal.ivan.navigationpractice.databinding.FragmentMain1Binding

class MainFragment1 : Fragment() {

    private lateinit var binding: FragmentMain1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMain1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonMain.setOnClickListener {
            findNavController().navigate(MainFragment1Directions.toMain2())
        }
    }
}