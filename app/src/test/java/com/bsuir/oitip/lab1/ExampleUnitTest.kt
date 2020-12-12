package com.bsuir.oitip.lab1

import org.junit.Assert.assertEquals
import org.junit.Test
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val expression = "Math.tan(4 + 5 )/3"
        //val result = ExpressionEngine.evaluate(expression, ExpressionContext()) as Number
        //assertEquals(3.toDouble(), result.toDouble(), 0.toDouble())
        val mgr = ScriptEngineManager()
        val engine: ScriptEngine = mgr.getEngineByName("JavaScript")
        val res = "5+5*(4/2)-7+1"
        println(engine.eval(expression))

    }
}