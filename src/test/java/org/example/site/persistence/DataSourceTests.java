package org.example.site.persistence;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/applicationContext.xml")
@Log4j
public class DataSourceTests {
    // 2. 커넥션풀 테스트
    // applicationcontext에 설정된 히카리세션풀 테스트 코드

    @Setter(onMethod_ = { @Autowired })
    private DataSource dataSource;

    @Setter(onMethod_ = { @Autowired })
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testConnection() {
        try (Connection con = dataSource.getConnection()) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    // sqlSession을 이용한 마이바티스 테스트
    @Test
    public void testMybatis() {
        try (SqlSession session = sqlSessionFactory.openSession();
            Connection con = session.getConnection();
            ) {
            log.info(session);
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
