package com.buba.testdemo2.dao.impl;

import com.buba.testdemo2.dao.UserDAO;
import com.buba.testdemo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/13 - 9:32
 *
 * jdbc 实现数据存储的效率是所有ORM框架中效率最高的
 *      但是mybatis相比jdbc而言效率没有明显差距，而且操作简单
 *      所以大部分公司还是选择用mybatis，除非架构明确要求使用jdbc
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user){
        String sql="insert into user(username,password) values(?,?)";
        //jdbcTemplate.update(sql,"zhangsan","123456");
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
               ps.setString(1,"zhangsan123");
               ps.setString(2,"123456");
            }
        });
    }


    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updataUser(User user) {

    }

    @Override
    public List<User> findUser(){
        String sql = "select * from user";
        List li = jdbcTemplate.query(sql,new RowMapper<List<User>>(){
            @Override
            public List<User> mapRow(ResultSet rs, int i)throws SQLException{
                List<User> resultlist = new ArrayList<>();
                while (rs.next()){
                    User u = new User();
                    u.setId(rs.getInt("id"));
                    u.setPassword(rs.getString("password"));
                    u.setUsername(rs.getString("username"));
                    resultlist.add(u);
                }
                return resultlist;
            }
        });
        System.out.println("list集合的长度:"+li.size());
        return li;
    }

    @Override
    public User findUserById(int id) {
        return null;
    }


}
