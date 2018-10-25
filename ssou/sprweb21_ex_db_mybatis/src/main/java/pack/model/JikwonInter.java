package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface JikwonInter {
	List<JikwonDto> list() throws DataAccessException;
	List<JikwonDto> search(String code) throws DataAccessException;
}
