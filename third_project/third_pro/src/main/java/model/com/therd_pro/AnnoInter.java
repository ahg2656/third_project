package model.com.therd_pro;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface AnnoInter {

	@Select("select * from material_list")
	public List<Material_list_DTO> selectAllData();	
}
