package personal.ivan.moduleb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import personal.ivan.moduleb.databinding.FragmentModuleB1Binding

class ModuleB1Fragment : Fragment() {

    private lateinit var binding: FragmentModuleB1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentModuleB1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonModuleB.setOnClickListener {
            findNavController().navigate(ModuleB1FragmentDirections.toModuleB2())
        }
    }
}