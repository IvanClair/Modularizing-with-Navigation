package personal.ivan.modulea

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ModuleAViewModel @Inject constructor(val util: ModuleAUtil) : ViewModel() {

    val a = MutableLiveData<String>()
}