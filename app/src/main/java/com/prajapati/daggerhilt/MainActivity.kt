package com.prajapati.daggerhilt

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.LruCache
import android.widget.Toast
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import data.ChildClass
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   var st:SuperClass= SuperClass();
    @HindiPersonsQualifiers
    @Inject
    lateinit var hindiPerson: Persons

    @EngishPersonQualifiers
    @Inject
    lateinit var englishPerson: Persons

    var handler: Handler = Handler()
    var runnable: Runnable? = null
    var delay = 10000
    var place:String?="dddfm"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        englishPerson.speak("English Persons");
        hindiPerson.speak("Hindi Persons")
        place?.length

        LruCache



    }

    override fun onResume() {

        super.onResume()
    }
    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable!!)
    }
}