package com.compose.core.common.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class BaseRepository(
    private val dispatcher: CoroutineDispatcher
) {
    suspend fun <T> safeCall(apiCall: suspend () -> T): Result<T> {
        return try {
            withContext(dispatcher) {
                Result.success(apiCall())
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}