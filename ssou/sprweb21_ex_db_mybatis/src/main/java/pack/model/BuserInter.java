package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BuserInter {
	List<BuserDto> buser(String code) throws DataAccessException;
	List<BuserDto> buserList() throws DataAccessException;
}
