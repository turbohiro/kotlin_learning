import org.junit.Assert
import org.junit.Test

class TestNetUtils{
    @Test
    fun testSendRequest(){
        val netutils = NetUtils()
        val msg = netutils.sendRequest()
        Assert.assertEquals("hello",msg)
    }


}