package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository	//DB 연결 관련
public class DataDao extends JdbcDaoSupport{
	@Autowired
	public DataDao(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public DataDao() {
		// TODO Auto-generated constructor stub
	}
	
	public List<SangpumDto> getDataAll(){
		String sql = "select * from sangdata";
		
		return getJdbcTemplate().query(sql, new ItemRowMapper());
	}
	
	//내부 클래스
	class ItemRowMapper implements RowMapper {
		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			SangpumDto dto = new SangpumDto();
			dto.setCode(rs.getString(1));
			dto.setSang(rs.getString(2));
			dto.setSu(rs.getString(3));
			dto.setDan(rs.getString(4));
						
			return dto;
		}
	}
}
