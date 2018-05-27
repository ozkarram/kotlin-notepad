package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by Oscar Álvarez on 23/05/18.
 */

val Context.layoutInflater get() = LayoutInflater.from(this)