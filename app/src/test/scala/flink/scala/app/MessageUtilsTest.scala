/*
 * This Scala source file was generated by the Gradle "init" task.
 */
package flink.scala.app

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

class MessageUtilsTest {
    @Test def testGetMessage(): Unit = {
        assertEquals("Hello      World!", MessageUtils.getMessage())
    }
}
