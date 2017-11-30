package ch.swissonid.template.di

import android.app.Application
import android.content.Context

import ch.swissonid.template.App
import dagger.Binds
import dagger.Module

/**
 * Created by pmueller on 30.10.17.
 */

@Module
abstract class AppModule {

    @Binds
    internal abstract fun application(app: App): Application

    @Binds
    internal abstract fun providesContext(application: Application): Context

}
