package json;

import java.sql.SQLException;

public class OddException extends SQLException {
	public OddException() {
		super("odd sum");
	}
}
