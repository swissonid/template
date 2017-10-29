package ch.swissonid.template.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.swissonid.template.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
