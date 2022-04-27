package com.example.nyc_schools_test.model

import com.example.nyc_schools_test.model.remote.SchoolListResponse
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun useCaseSchoolList(): Flow<UIState>
    fun useCaseSchoolSatByDBN(dbn: String): Flow<UIState>
}