package com.prajapati.daggerhilt

import android.util.Log
import javax.inject.Inject

class HindiPerson @Inject constructor(): Persons {
    override fun speak(str: String) {
        Log.i("Person:",str)
        Log.i("Personddddd:",str)
        Log.i("Manoj Kumar:",str)
    }
}
