package com.example.android.dagger.ui.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.ui.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.ui.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

/**
 * Classes annotated with @ActivityScope will have unique instance
 * in this Component
 *
 * Definition of a Dagger subcomponent.
 */
@ActivityScope
@Subcomponent
interface RegistrationComponent {

    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component.
    fun inject (activity: RegistrationActivity)
    fun inject (fragment: EnterDetailsFragment)
    fun inject (fragment: TermsAndConditionsFragment)
}