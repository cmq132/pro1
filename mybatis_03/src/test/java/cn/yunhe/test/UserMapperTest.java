package cn.yunhe.test;

import cn.yunhe.entity.User;
import cn.yunhe.mapper.UserMapper;
import cn.yunhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class UserMapperTest {
//    @Test
//    public void  testFindUser(){
//        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
//        SqlSession sqlSession = sessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.findUser(41);
//        System.out.println(user);
//        sqlSession.close();
//    }
}
