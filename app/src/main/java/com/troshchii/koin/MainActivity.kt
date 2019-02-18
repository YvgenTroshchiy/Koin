package com.troshchii.koin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val tag = this@MainActivity.javaClass.simpleName

    private val textView by lazy { findViewById<TextView>(R.id.textView) }

    private val presenter: Presenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate")
        setContentView(R.layout.activity_main)

        textView.text = presenter.sayHello()
    }
}
