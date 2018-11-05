package model.com.third_pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Pby_AnnoImpl implements Pby_AnnoInter{
	
	@Autowired
	private Pby_AnnoInter annoInter;

	public List<Pby_Material_list_DTO> selectAllData() {
		// TODO Auto-generated method stub
		return annoInter.selectAllData();
	}
}
