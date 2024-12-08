import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UtilitiesTest {

    // 'cities' tablosundan nufusu 3 milyondan fazla olan sehir isimleri sorgula
    // verilen sehir isimlerini doğrula "Istanbul", "Ankara", "Izmir"

    @Test
    public void Test3() throws SQLException {

        ResultSet rs = JdbcUtils.executeQuery("SELECT city_name FROM cities WHERE population>3000000");
        ArrayList<String> list = new ArrayList<>();

        while (rs.next()) {

            String cities = rs.getString("city_name");
            list.add(cities);

        }
        Assert.assertTrue(list.contains("Istanbul"));
        Assert.assertTrue(list.contains("Ankara"));
        Assert.assertTrue(list.contains("Izmir"));

        JdbcUtils.close();

    }
}
