package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.MemBean;

@Repository	//생성과 관련된 어노테이션
public class MemDaoImpl extends SqlSessionDaoSupport implements MemDaoInter{
	@Autowired	//객체 생성과 관련되지 않음
	public MemDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public List<MemDto> getDataAll() {
		return getSqlSession().selectList("selectDataAll");
	}
	public MemDto selectPart(String num) {
		return getSqlSession().selectOne("selectPart", num);
	}
	public boolean insertData(MemBean bean) {
		try {
			getSqlSession().selectOne("insertData", bean);
			return true;
		} catch (Exception e) {
			System.out.println("insertData err : " + e);
			return false;
		}	
	}
	public boolean updateData(MemBean bean) {
		try {
			getSqlSession().selectOne("updateData", bean);
			return true;
		} catch (Exception e) {
			System.out.println("updateData err : " + e);
			return false;
		}	
	}
	public boolean deleteData(String num) {
		try {
			getSqlSession().selectOne("deleteData", num);
			return true;
		} catch (Exception e) {
			System.out.println("deleteData err : " + e);
			return false;
		}	
	}
}
