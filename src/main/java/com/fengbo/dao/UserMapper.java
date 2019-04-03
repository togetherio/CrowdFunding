package com.fengbo.dao;

import com.fengbo.bean.User;
import com.fengbo.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String usId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String usId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //用户登陆  手机号，密码
    User userLogin(@Param("usPhone") String usPhone, @Param("usPassword") String usPassword);
    
    //插入一个标记 ，说明实名认证的两张照片都已经提交
    int insertSignById(String usId);
    
    //查询标志位为 1 的，即实名认证的两张照片都已经提交
  	List<User> selectBySign(int sign);
  	
  	//插入一个标记1，并同时存入 照片路径，身份证文字信息 ，说明实名认证审核通过
  	int insertPassSign(@Param("usId")String usId,@Param("usRealname")String usRealname,@Param("usSex")String usSex,@Param("usEntic")String usEntic,@Param("usBirthday")String usBirthday,@Param("usAddress")String usAddress,@Param("usIdcard")String usIdcard,@Param("usFaceImgAddr")String usFaceImgAddr,@Param("usIdcardImgAddr")String usIdcardImgAddr);
  	
  	//插入一个标记2，说明实名认证审核没有通过，不存入 照片路径，身份证文字信息
  	int insertNopassSign(String usId);
  	
  	//未提交照片进行身份认证
  	User noCheck(String usId);
  	//审核中
  	User checkWait(String usId);
  	//审核通过
  	User checkPass(String usId);
  	//审核不通过
  	User checkNopass(String usID);
}