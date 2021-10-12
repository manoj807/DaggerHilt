package com.prajapati.daggerhilt

import androidx.core.app.ActivityCompat
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class PersonModule {

    @EngishPersonQualifiers
    @Binds
    abstract fun getEngishPerson(person:EgnishPerson):Persons

    @HindiPersonsQualifiers
    @Binds
    abstract fun getHindiPerson(person:HindiPerson):Persons
}