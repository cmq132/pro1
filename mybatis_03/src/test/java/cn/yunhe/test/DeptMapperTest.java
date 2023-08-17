package cn.yunhe.test;

import cn.yunhe.entity.Dept;
import cn.yunhe.mapper.DeptMapper;
import cn.yunhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class DeptMapperTest {
    @Test
    public void testFindDept(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.findDept("销售部");
        System.out.println(dept.getDname());
        sqlSession.close();

    }
}
