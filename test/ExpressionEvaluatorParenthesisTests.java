import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionEvaluatorParenthesisTests {

	@ParameterizedTest
	@CsvSource({
			"( 11 + 66 ), 77",
			"( 7 - 3 ) * 2, 8",
			"( ( 7 - 3 ) * 2 ), 8",
			"2 / ( 2 * 2 ), 0",
			"( 5 + 15 ) * ( 3 * ( 4 - ( 5 + 7 / 2 ) ) ), -240",
			"( 2 * 3 ) ^ 2, 36",
			"10 + ( 10 + 2 ^ 3 ) / 6, 13"
	})
	public void test( String expression, int expectedResult ) {
		String message = String.format("Expression: '%s'", expression);
		assertEquals(expectedResult, ExpressionEvaluator.evaluate(expression), message);
	}

}
