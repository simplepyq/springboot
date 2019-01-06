package cn.pyq.springboot.mapper;

import cn.pyq.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 *
 * @author pyq
 * @date 2018/12/03
 */

@Mapper
@Repository
public interface UserMapper {

	@Select(value = {"select * from db_boot.user where username=#{username}"})
	User queryByUsername(String username);

	@Select(value = {"insert into db_boot.user value (null,#{username},#{password})"})
	void create(User user);
}
