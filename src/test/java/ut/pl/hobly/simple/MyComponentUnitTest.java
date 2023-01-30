package ut.pl.hobly.simple;

import org.junit.Test;
import pl.hobly.simple.api.MyPluginComponent;
import pl.hobly.simple.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}