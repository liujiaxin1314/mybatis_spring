package com.jxliu.ms.mapper;

import java.util.List;
import com.jxliu.ms.pojo.QueryVo;
import com.jxliu.ms.pojo.User;
public interface UserMapper {
	User getUserById(int id);
	List<User> getUserByName(String username);
	void insertUser(User user);
	User getUserByQueryVo(QueryVo queryVo);
	Integer getUserCount();
	List<User> findUserList(User user);
	List<User> findUserByIds(QueryVo queryVo);
}
