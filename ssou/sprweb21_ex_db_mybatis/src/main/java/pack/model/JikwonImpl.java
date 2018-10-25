package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class JikwonImpl extends SqlSessionDaoSupport implements JikwonInter{
	@Autowired
	public JikwonImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public List<JikwonDto> list() throws DataAccessException {
		return getSqlSession().selectList("selectJikAll");
	}
	
	public List<JikwonDto> search(String code) throws DataAccessException {
		return getSqlSession().selectList("selectJikPart", code);
	}
}
