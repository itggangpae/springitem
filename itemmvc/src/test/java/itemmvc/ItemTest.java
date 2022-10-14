package itemmvc;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adamsoft.item.dao.ItemRepository;
import com.adamsoft.item.domain.ItemDTO;

//테스트를 위한 클래스를 로드
//JUnit - Java 의 단위 테스트를 라이브러리, Eclipse 내장
@RunWith(SpringJUnit4ClassRunner.class)

//설정 파일을 읽어옵니다.
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})

public class ItemTest {
	//DataSource 주입
	@Autowired
	private DataSource dataSource;
	
	//테스트 메서드를 만들기 위한 어노테이션
	//@Test
	public void testConnection() {
		try(Connection con = 
				dataSource.getConnection()){
			System.out.println(con);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	@Autowired
	private SqlSession sqlSession;
	
	//@Test
	public void testMyBatis() {
		System.out.println(sqlSession);
	}
	
	@Autowired
	private ItemRepository itemRepository;
	
	public void testGetAll() {
		System.out.println(itemRepository.getAll());
	}
	
	
	
}




