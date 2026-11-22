package com.muzik.innertubex

import com.muzik.innertubex.cipher.YouTubeCipherServiceTest.Companion.PLAYER_CODE
import com.muzik.innertubex.utils.sha1
import kotlinx.coroutines.runBlocking
import meow.nyx.quackjs.PlayerProgram
import meow.nyx.quackjs.UnsupportedPlayerException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NativeRuntimeTest {
    @Test
    fun nativeImplementationsWork() =
        runBlocking {
            assertEquals("a9993e364706816aba3e25717850c26c9cd0d89d", sha1("abc"))
            val program = PlayerProgram.compile(PLAYER_CODE)
            assertEquals("cba", program.decipherSignature("abc"))
            assertEquals("value_done", program.transformN("value"))
            assertFailsWith<UnsupportedPlayerException> { PlayerProgram.compile("unsupported") }
            Unit
        }
}
