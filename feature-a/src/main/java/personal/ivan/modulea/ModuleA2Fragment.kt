package personal.ivan.modulea

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import dagger.android.support.DaggerFragment
import personal.ivan.view_model_di.AppViewModelFactory
import javax.inject.Inject

class ModuleA2Fragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: AppViewModelFactory
    private val viewModel by navGraphViewModels<ModuleAViewModel>(R.id.nav_module_a_graph) { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_module_a_2, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        val a = viewModel.a.value
        Log.i("", "")
    }
}