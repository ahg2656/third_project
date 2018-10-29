package pack.model;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GogekImpl extends SqlSessionDaoSupport implements GogekInter{
	@Autowired
	public GogekImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public GogekDto loginCheck(String name) {
		return getSqlSession().selectOne("loginCheck", name);
	}
}
