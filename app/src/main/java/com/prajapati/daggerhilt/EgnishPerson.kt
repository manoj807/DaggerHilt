package com.prajapati.daggerhilt

import android.util.Log
import javax.inject.Inject

class EgnishPerson @Inject constructor():Persons {
    override fun speak(str: String) {

        Log.i("Person:",str)

        var data:String?=null

        data?.length
        


    }
}
