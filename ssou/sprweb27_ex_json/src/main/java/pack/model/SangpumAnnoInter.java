package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface SangpumAnnoInter {
	@Select("select * from sangdata")
	public List<SangpumDto> getDataAll();
}
