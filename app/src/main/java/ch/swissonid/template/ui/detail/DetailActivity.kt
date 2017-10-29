package ch.swissonid.template.ui.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ch.swissonid.template.R
import dagger.android.AndroidInjection

/**
 * Created by pmueller on 28.10.17.
 */
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}