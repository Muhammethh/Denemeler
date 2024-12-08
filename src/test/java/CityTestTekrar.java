import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CityTestTekrar {


    @Test
    public void Test1() throws SQLException {

        //veritabanına bağlan
        //'cities' tablosundan sehir isimlerini al
        //city_name sütununda en az 10 tane sehir ismi olduğunu doğrulayın
        //bağlantıyı kapat


        ResultSet rs = JdbcUtils.executeQuery("SELECT city_name FROM cities");

        ArrayList<String> cities = new ArrayList<>();

        while (rs.next()) {

            cities.add(rs.getString("city_name"));
        }

        Assert.assertTrue(cities.size() >= 10);

        JdbcUtils.close();


    }
}
