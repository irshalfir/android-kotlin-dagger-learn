package com.example.android.dagger.user

import com.example.android.dagger.ui.main.MainActivity
import com.example.android.dagger.ui.settings.SettingsActivity
import com.example.android.dagger.ui.splash.SplashActivity
import dagger.Subcomponent

/**
 * Scope annotation that the [UserComponent] uses
 * Classes annotated with @LoggedUserScope will have a unique instance
 * in this component.
 */
@LoggedUserScope
@Subcomponent
interface UserComponent {

    // Factory to create instances of UserComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    // Classes that can be injected by this component
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)

}