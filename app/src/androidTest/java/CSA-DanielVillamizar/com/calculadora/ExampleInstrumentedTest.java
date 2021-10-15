package CSA-DanielVillamizar.com.calculadora;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

<<<<<<< HEAD:app/src/androidTest/java/CSA-DanielVillamizar/com/calculadora/ExampleInstrumentedTest.java
        assertEquals("CSA-DanielVillamizar.calculadora", appContext.getPackageName());
=======
        assertEquals("CSA-DanielVillamizar.com.calculadora", appContext.getPackageName());
>>>>>>> 73db763210404a21309b4fd573379d05c6e6a1c1:app/src/androidTest/java/mari709/com/calculadora/ExampleInstrumentedTest.java
    }
}
