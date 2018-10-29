package pack.model;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JikwonImpl extends SqlSessionDaoSupport implements JikwonInter{
	@Autowired
	public JikwonImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public JikwonDto getInfo(String name) {
		return getSqlSession().selectOne("selectJikwonInfo", name);
	}
}
