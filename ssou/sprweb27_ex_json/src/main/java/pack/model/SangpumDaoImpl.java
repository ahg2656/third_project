package pack.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SangpumDaoImpl implements SangpumDaoInter{
	@Autowired
	SangpumAnnoInter annoInter;
	
	public List<SangpumDto> getDataAll() {
		return annoInter.getDataAll();
	}
}
