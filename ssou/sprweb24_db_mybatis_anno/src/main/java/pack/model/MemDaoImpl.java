package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.MemBean;

@Repository	//생성과 관련된 어노테이션
public class MemDaoImpl implements MemDaoInter{
	//인터페이스 가져옴
	@Autowired
	private MemAnnoInter inter;
	
	public List<MemDto> getDataAll() {
		return inter.getDataAll();
	}
	public MemDto selectPart(String num) {
		return inter.selectPart(num);
		
		
	}
	public boolean insertData(MemBean bean) {
		int re = inter.insertData(bean);
		if(re > 0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean updateData(MemBean bean) {
		int re = inter.updateData(bean);
		if(re > 0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean deleteData(String num) {
		int re = inter.deleteData(num);
		if(re > 0) {
			return true;
		} else {
			return false;
		}
	}
}
