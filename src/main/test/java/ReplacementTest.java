import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplacementTest {
    @Test
    public void testReplaceHotLine() {
        Replacement main = new Replacement();
        String result = main.replaceHotLine("Call us at 0 800 123 456");
        assertEquals("Call us at HOT_LINE", result);
    }
}