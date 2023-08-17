package cn.yunhe.test;

import cn.yunhe.entity.Orders;
import cn.yunhe.mapper.OrdersMapper;
import cn.yunhe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class OrdersMapperTest {
    @Test
    public void testFindOrder(){
        SqlSessionFactory sessionFactory = MybatisUtils.getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        Orders order = mapper.findOrder(2);
        System.out.println(order);
        sqlSession.close();
    }
}
