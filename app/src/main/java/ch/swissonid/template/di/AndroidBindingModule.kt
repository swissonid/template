package ch.swissonid.template.di

import ch.swissonid.template.ui.detail.DetailActivity
import ch.swissonid.template.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by pmueller on 29.10.17.
 */
@Module
abstract class AndroidBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun detailActivity(): DetailActivity
}