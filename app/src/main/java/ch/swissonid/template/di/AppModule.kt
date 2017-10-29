package ch.swissonid.template.di

import android.app.Application
import ch.swissonid.template.App
import dagger.Binds
import dagger.Module


/**
 * Created by pmueller on 28.10.17.
 */
@Module
abstract class AppModule {

    @Binds abstract fun application(app: App): Application

    /*companion object {
        @JvmStatic
        @Provides @Singleton fun provideContext(application: Application): Context {
            return application
        }
    }*/


}
