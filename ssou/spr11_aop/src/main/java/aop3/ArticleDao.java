package aop3;

import org.springframework.stereotype.Repository;

@Repository		//DB 와 접촉하는 클래스
public class ArticleDao implements ArticleInter{
	@Override
	public void selectAll() {
		System.out.println("상품 테이블 전체자료 읽기");
	}
}
