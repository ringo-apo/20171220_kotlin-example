package demo 

import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun f() {
        assertEquals("Hello, CentOS6!", getGreeting())
    }
}
