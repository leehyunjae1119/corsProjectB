package com.cors.lhj.model.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//db랑 연결하는 클래스라는 것을 명시
//@controller -> @service  - > @repository 순으로 호출 

@Repository
public class CustomerDaoImple implements CustomerDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
}
