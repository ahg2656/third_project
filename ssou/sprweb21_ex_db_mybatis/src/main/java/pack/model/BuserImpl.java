package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class BuserImpl extends SqlSessionDaoSupport implements BuserInter{
	@Autowired
	public BuserImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public List<BuserDto> buser(String code) {
		return getSqlSession().selectList("selectBuser", code);
	}
	
	public List<BuserDto> buserList() throws DataAccessException {
		return getSqlSession().selectList("selectBuserList");
	}
}
