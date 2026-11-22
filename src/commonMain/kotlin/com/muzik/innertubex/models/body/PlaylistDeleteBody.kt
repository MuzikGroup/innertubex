package com.muzik.innertubex.models.body

import com.muzik.innertubex.models.Context
import kotlinx.serialization.Serializable

@Serializable
internal data class PlaylistDeleteBody(
    val context: Context,
    val playlistId: String,
)
