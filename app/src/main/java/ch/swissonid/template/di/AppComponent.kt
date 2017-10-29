package ch.swissonid.template.di

import ch.swissonid.template.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector


/**
 * Created by pmueller on 28.10.17.
 */
@Component(modules = arrayOf(
        AppModule::class,
        AndroidBindingModule::class,
        AndroidInjectionModule::class
    ))

interface AppComponent: AndroidInjector<App> {
    @Component.Builder abstract class Builder: AndroidInjector.Builder<App>()
}