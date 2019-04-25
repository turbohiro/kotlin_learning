import org.junit.Assert
import org.junit.Test

class TestGirl{
    @Test
    fun testgirlGreeting(){
        val girl = Girl()
        val msg = girl.greeting()
        Assert.assertEquals("hello",msg)
    }
}