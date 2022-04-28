package com.example.nyc_schools_test.common

class DataManager {
    val isStale: Boolean
    get() = verifyLastUpdate()

    private fun verifyLastUpdate(): Boolean {
        // todo
        // create the shared preference and check
        // last network update.

    }

    fun updateLastFetch() {
        // todo save current time in SP
    }
}