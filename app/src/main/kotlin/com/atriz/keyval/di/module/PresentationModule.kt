package com.atriz.keyval.di.module

import com.atriz.core_presentation.navigation.HomeNavigationHolder
import com.atriz.core_presentation.navigation.NavigationHolder
import com.atriz.keyval.navigation.AppHomeNavigationHolder
import com.atriz.keyval.navigation.AppNavigationHolder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresentationModule {

    @Singleton
    @Provides
    fun provideNavigationHolder(): NavigationHolder {
        return AppNavigationHolder()
    }

    @Singleton
    @Provides
    fun provideHomeNavigationHolder(): HomeNavigationHolder {
        return AppHomeNavigationHolder()
    }
}
