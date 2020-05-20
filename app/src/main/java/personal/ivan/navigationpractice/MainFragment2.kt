package personal.ivan.navigationpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import personal.ivan.navigationpractice.databinding.FragmentMain2Binding

class MainFragment2 : Fragment() {

    private lateinit var binding: FragmentMain2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMain2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonToModuleA.setOnClickListener {
            findNavController().navigate(MainFragment2Directions.toModuleA())
        }

        binding.buttonToModuleB.setOnClickListener {
            findNavController().navigate(MainFragment2Directions.toModuleB())
        }
    }
}