package personal.ivan.navigationpractice

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import personal.ivan.modulea.ModuleAFragmentModule
import personal.ivan.view_model_di.AppViewModelModule
import javax.inject.Singleton

/* ------------------------------ Application Scope Component */

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppViewModelModule::class,
        ModuleAFragmentModule::class
    ]
)
interface ApplicationScopeComponent : AndroidInjector<MainApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: MainApplication): ApplicationScopeComponent
    }
}