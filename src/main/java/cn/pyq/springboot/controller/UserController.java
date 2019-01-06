package cn.pyq.springboot.controller;

import cn.pyq.springboot.mapper.UserMapper;
import cn.pyq.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc:
 *
 * @author pyq
 * @date 2018/12/03
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{

	UserMapper userMapper;

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@RequestMapping("login")
	public String login(User user){
		User indexUser=userMapper.queryByUsername(user.getUsername());
		if(indexUser!=null){
			if(indexUser.getPassword().equals(user.getPassword())){
				session.setAttribute("user",indexUser);
				return "home";
			}
		}
		session.setAttribute("message","Invalid username or password!");
		return "index";
	}

	@RequestMapping("register")
	public String register(User user){
		userMapper.create(user);
		return "index";
	}
}
