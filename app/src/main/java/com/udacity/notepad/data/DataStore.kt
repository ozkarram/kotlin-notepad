package com.udacity.notepad.data

import android.content.Context
import org.jetbrains.anko.doAsync

object DataStore {

    @JvmStatic
    var notes: NoteDatabase? = null
        private set

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(runnable: Runnable) {
        anotherLambdaFunction { runnable.run() }
    }

    private fun anotherLambdaFunction(function: () -> Unit) {
        doAsync { function() }
    }
}
