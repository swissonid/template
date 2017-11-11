package ch.swissonid.template.di;

import android.app.Application;
import android.content.Context;

import ch.swissonid.template.App;
import dagger.Binds;
import dagger.Module;

/**
 * Created by pmueller on 30.10.17.
 */

@Module
public abstract class AppModule {

    @Binds
    abstract Application application(App app);

    @Binds
    abstract Context providesContext(Application application);

}
