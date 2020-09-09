package org.example.site.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.fail;

@Log4j
public class JDBCTests {
    // 제일 첫번째로 해야할 작업, DB와 원활히 연동이 되는지 테스트, 디비드라이버만 pom에 추가후 테스트한다.
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnecton() {
        try (Connection con =
                     DriverManager.getConnection(
                             "jdbc:mariadb://127.0.0.1:3306/test_ex",
                             "test",
                             "rhksrb10"
                     )) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
