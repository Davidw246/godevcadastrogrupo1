package persistence;

import static org.junit.Assert.assertNotNull;

import org.hibernate.Session;
import org.junit.Test;

public class DBConnectionTest {

	@Test
	public void testConnection() {
		Session session = DBConnection.getSession();
		assertNotNull(session);

		// String url =
		// "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		// Connection conn = DriverManager.getConnection(url);
	}

}
