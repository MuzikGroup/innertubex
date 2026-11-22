package com.muzik.innertubex.models.body

import com.muzik.innertubex.models.Context
import kotlinx.serialization.Serializable

@Serializable
internal data class GetQueueBody(
    val context: Context,
    val videoIds: List<String>?,
    val playlistId: String?,
)
