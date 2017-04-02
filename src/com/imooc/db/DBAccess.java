package com.imooc.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 访问数据库类
 */
public class DBAccess {
	public SqlSession getSqlSession() throws IOException{
		
		String config = "com/imooc/config/Configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(config);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(inputStream);
		SqlSession sqlSession = factory.openSession();
		
		return sqlSession;
		
	}
}
