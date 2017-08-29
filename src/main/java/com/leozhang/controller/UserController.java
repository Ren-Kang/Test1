package com.leozhang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.leozhang.entity.User;
import com.leozhang.entity.UserExample;
import com.leozhang.entity.UserExample.Criteria;
import com.leozhang.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	private IUserService service;
	
	
	@RequestMapping(value="/list")
	public String queryUser(Model mm,HttpServletRequest request){
		/*UserExample e = new UserExample();
		List<User>list = service.queryUser(e);
		mm.addAttribute("list",list);*/
		return "list";
	}
	@RequestMapping(value="/login")
	public String login(Model mm,User u,HttpServletRequest request){
		/*System.out.println(u);
		Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(u.getUserName(),u.getPassword());
        subject.login(token);*/
		User user = null;
		user = service.queryUserByName(u.getUserName());
		//mm.addAttribute("user", user);
		if(null != user || !"".equals(user)){
			UserExample e = new UserExample();
			List<User>list = service.queryUser(e);
			mm.addAttribute("list",list);
		}
		return "users";
	}
	@RequestMapping(value="/add")
	public String add(HttpServletRequest request){
		return "add";
	}
	@RequestMapping(value="/insert")
	public String insert(User user){
		service.insert(user);
		return "redirect:/user/login";
	}
	@RequestMapping(value="/{id}/delete")
	public String delete(@PathVariable int id,Model mm){
		service.deleteByPrimaryKey(id);
		return "redirect:/user/login";
	}
	@RequestMapping(value="/{id}/update")
	public String update(@PathVariable int id, Model mm){
		User user = service.selectByPrimaryKey(id);
		mm.addAttribute("user",user);
		return "update";
	}
	@RequestMapping(value="{id}/update1")
	public String update1(User user){
		service.updateByPrimaryKey(user);
		return "redirect:/user/login";
	}
	@RequestMapping(value="/select")
	public String select(String sel ,Model mm){
		UserExample e = new UserExample();
		Criteria criteria = e.createCriteria();
		criteria.andUserNameLike("%"+sel+"%");
		List<User> users = service.queryUser(e);
	
//		List<User> users = service.select(sel);
		mm.addAttribute("list",users);
		return "users";
	}
}
