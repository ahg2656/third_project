package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import pack.controller.MemberBean;

@Repository
public class MemberDao extends JdbcDaoSupport{
	@Autowired
	public MemberDao(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	
	//페이징 처리
	public List<MemberDto> getMemberList(int startRow, int endRow){
		String sql = "select * from memtab limit ?,?";
		
		List<MemberDto> list = getJdbcTemplate().query(sql, new Object[] {startRow, endRow}, 
				new RowMapper() {
					public Object mapRow(ResultSet rs, int arg1) throws SQLException {
						MemberDto dto = new MemberDto();
						dto.setId(rs.getString("id"));
						dto.setPasswd(rs.getString("passwd"));
						dto.setName(rs.getString("name"));
						dto.setReg_date(rs.getString("reg_date"));
										
						return dto;
					}
		});
		
		return list;
	}
	
	public int getMemberCount() {	//페이지 나누기 시 전체 행 필요
		String sql = "select count(*) from memtab";
		return getJdbcTemplate().queryForObject(sql, Integer.class);
	}
	
	public MemberDto getMember(String id) {
		String sql = "select * from memtab where id = ?";
		
		MemberDto dto = (MemberDto) getJdbcTemplate().queryForObject(sql, new Object[] {id}, 
			new RowMapper() {
				public Object mapRow(ResultSet rs, int arg1) throws SQLException {
					MemberDto dto = new MemberDto();
					dto.setId(rs.getString("id"));
					dto.setPasswd(rs.getString("passwd"));
					dto.setName(rs.getString("name"));
					dto.setReg_date(rs.getString("reg_date"));
					
					return dto;
				} 
			});
		return dto;
	}
	
	//추가
	public void insertData(MemberBean bean) {
		String sql = "insert into memtab values(?,?,?,now())";
		Object[] params = {bean.getId(), bean.getPasswd(), bean.getName()};
		getJdbcTemplate().update(sql, params);
	}
	
	//수정
	public void updateData(MemberBean bean) {
		String sql = "update memtab set passwd=?, name=? where id=?";
		Object[] params = {bean.getPasswd(), bean.getName(), bean.getId()};
		getJdbcTemplate().update(sql, params);
	}
	
	//삭제
	public void deleteData(String id) {
		String sql = "delete from memtab where id = ?";
		getJdbcTemplate().update(sql, new Object[] {id});
	}
}
