package personal.ivan.modulea

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navGraphViewModels
import dagger.android.support.DaggerFragment
import personal.ivan.modulea.databinding.FragmentModuleA1Binding
import personal.ivan.view_model_di.AppViewModelFactory
import javax.inject.Inject

class ModuleA1Fragment : DaggerFragment() {

    private lateinit var binding: FragmentModuleA1Binding
    private val args by navArgs<ModuleA1FragmentArgs>()

    @Inject
    lateinit var viewModelFactory: AppViewModelFactory
    private val viewModel by navGraphViewModels<ModuleAViewModel>(R.id.nav_module_a_graph) { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentModuleA1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonModuleA.setOnClickListener {
            findNavController().navigate(ModuleA1FragmentDirections.toModuleA2())
        }

        val bundle = Bundle()
        viewModel.a.value = "abc"
        Log.i("", "")
    }
}