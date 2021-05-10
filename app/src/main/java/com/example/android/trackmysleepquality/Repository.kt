package com.example.android.trackmysleepquality

import android.app.Application
import com.example.android.trackmysleepquality.database.SleepDatabaseDao

class Repository(val database: SleepDatabaseDao,
                 application: Application) {
}