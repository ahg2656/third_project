package controller;

import model.DataDao;

public class SelectServiceImpl implements SelectService{
	private DataDao dataDao;
	
	public SelectServiceImpl(DataDao dataDao) {
		//생성자 주입
		this.dataDao = dataDao;
		System.out.println("SelectServiceImpl 생성자");
	}
	
	@Override
	public void selectProcess() {
		dataDao.selectData();
		//부모 클래스의 이름으로 자식의 메소드를 호출
		
	}
}
