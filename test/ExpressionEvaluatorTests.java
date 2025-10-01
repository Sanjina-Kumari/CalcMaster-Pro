import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorTests {

    @Test
    public void testExpression1() throws Exception {
        String e = "7 - 3 * 2";
        assertEquals(1, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression2() throws Exception {
        String e = "11 + 66";
        assertEquals(77, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression3() throws Exception {
        String e = "2 / 2 * 2";
        assertEquals(2, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression4() throws Exception {
        String e = "2 ^ 5";
        assertEquals(32, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression5() throws Exception {
        String e = "2 * 3 ^ 2";
        assertEquals(18, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression6() {
        String e = "7 - 3 + 2";
        assertEquals(6, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression7() throws Exception {
        String e = "7 * 3 + 2";
        assertEquals(23, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression8() throws Exception {
        String e = "7 * 2 ^ 3 + 1";
        assertEquals(57, ExpressionEvaluator.evaluate(e), e );
    }

    @Test
    public void testExpression9() throws Exception {
        String e = "367 + 34 * 14 * 46";
        assertEquals(22263, ExpressionEvaluator.evaluate(e), e);
    }

    @Test
    public void testLongExpression1() throws Exception {
        String e = "-21 * 18 - 21 + 1 + 41 + -44 * -23 - -8 * -40 + 32 + 34 * 14 * 46 + -11 / -47 * -1 - -19 - -38 - 2 + 34 * -47 - 6 / 7 + -8 * -8 * -28 + 45 - -39 - 25 - -49 / 11 + -39 * 17 - 47 / -40 * -32 * -20 + 37 / 40 * 26 / 24 * -45 * -17 / -5 / -24 + 13 / -35 - -9 * 49 * 28";
        assertEquals(31316, ExpressionEvaluator.evaluate(e), e);
    }

    @Test
    public void testLongExpression2() throws Exception {
        String e = "35 - 37 - 50 * 33 - 41 + 28 / 4 - 42 - 30 + 49 * 39 / 50 * 27 * 13 / 29 + 23 - 43 * 5 / 3 + 15 * 21 + 2 * 33 * 31 * 45 * 15 - 43 * 26 - 17 - 19 * 25 - 40 + 31 / 19 + 48 / 27 / 50 / 11 * 32 + 17 * 32 - 26 + 28 * 17 * 25 ^ 5 + 11 + 34 * 17 * 1";
        assertEquals(354849680, ExpressionEvaluator.evaluate(e), e);
    }

    @Test
    public void testExpressionError1() throws Exception {
        // Check that an exception is thrown when the operand stack
        // has more than one item at the end of parsing.
        assertThrows( RuntimeException.class,
                () -> ExpressionEvaluator.evaluate("5 + 5 + 5 5")
        );
    }

    @Test
    public void testExpressionError2() throws Exception {
        // operand stack is empty early.
        assertThrows(RuntimeException.class,
                () -> ExpressionEvaluator.evaluate("5 +")
        );
    }

    @Test
    public void testExpressionError3() throws Exception {
        // operand stack is empty early.
        assertThrows( RuntimeException.class,
                () -> ExpressionEvaluator.evaluate("5 + +")
        );
    }
}
