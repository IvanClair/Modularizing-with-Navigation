package personal.ivan.modulea

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import personal.ivan.view_model_di.ViewModelKey
import javax.inject.Scope

/* ------------------------------ Scope */

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class ModuleAScope

/* ------------------------------ Fragment Module */

@Suppress("unused")
@Module
abstract class ModuleAFragmentModule {

    @ModuleAScope
    @ContributesAndroidInjector(
        modules = [
            ModuleAViewModelModule::class,
            ModuleAUtilModule::class]
    )
    abstract fun contributeModuleA1Fragment(): ModuleA1Fragment

    @ModuleAScope
    @ContributesAndroidInjector(
        modules = [
            ModuleAViewModelModule::class,
            ModuleAUtilModule::class]
    )
    abstract fun contributeModuleA2Fragment(): ModuleA2Fragment
}

/* ------------------------------ ViewModel */

@Suppress("unused")
@Module
abstract class ModuleAViewModelModule {

    @ModuleAScope
    @Binds
    @IntoMap
    @ViewModelKey(ModuleAViewModel::class)
    abstract fun bindModuleAViewModel(viewModel: ModuleAViewModel): ViewModel
}

/* ------------------------------ Util */

@Module
object ModuleAUtilModule {

    @ModuleAScope
    @JvmStatic
    @Provides
    fun provideModuleAUtil(): ModuleAUtil = ModuleAUtil()
}