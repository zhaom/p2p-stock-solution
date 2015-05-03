package com.solution.p2p.core.service;

import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.entity.MemberExample;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.service.MemberService;
import com.solution.p2p.core.common.utils.Constants;
import com.solution.p2p.core.common.utils.PasswordUtil;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.dao.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by johnKee on 2015/4/17.
 */
@Service
public class MemberServiceImpl extends BasicServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public ServiceResult<Integer> createUser(Member member, String appKey, String signature) {
        ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
        memberMapper.insertSelective(member);
        return serviceResult;
    }

    @Override
    public ServiceResult<Member> findByUsername(String content, String appKey, String signature) {
        ServiceResult<Member> serviceResult = new ServiceResult<Member>();
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.or();
        criteria.andUnameEqualTo(content);
        criteria = memberExample.or();
        criteria.andMobileEqualTo(content);
        criteria = memberExample.or();
        criteria.andEmailEqualTo(content);
        List<Member> members = memberMapper.selectByExample(memberExample);
        if(members == null || members.size() == 0){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_DATA_NOT_FOUND);
            serviceResult.setErrorMessage("用户名不存在！");
        }else if(members.size() > 1){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_DATA_DEPULATE);
            serviceResult.setErrorMessage("存在重复的用户数据！");
        }else {
            serviceResult.setValue(members.get(0));
        }
        return serviceResult;
    }

    @Override
    public ServiceResult<Integer> resetPassword(Long mid, String oldPassword, String newPassword, String appKey, String signature) {
        ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
        Member member = memberMapper.selectByPrimaryKey(mid);
        if(member == null){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_DATA_NOT_FOUND);
            serviceResult.setErrorMessage("用户名不存在！");
        } else if(PasswordUtil.validatePassword(oldPassword, member.getPassword())){
            member.setPassword(PasswordUtil.entryptPassword(newPassword));
            memberMapper.updateByPrimaryKeySelective(member);
            serviceResult.setSuccess(true);
        } else {
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_PASSWD_INCORRECT);
            serviceResult.setErrorMessage("密码输入有误！");
        }
        return serviceResult;
    }

    @Override
    public ServiceResult<Integer> resetTradePassword(Long mid, String oldPassword, String newPassword, String appKey, String signature) {
        ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
        Member member = memberMapper.selectByPrimaryKey(mid);
        if(member == null){
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_DATA_NOT_FOUND);
            serviceResult.setErrorMessage("用户名不存在！");
        } else if(PasswordUtil.validatePassword(oldPassword, member.getTradePassword())){
            member.setTradePassword(PasswordUtil.entryptPassword(newPassword));
            memberMapper.updateByPrimaryKeySelective(member);
            serviceResult.setSuccess(true);
        } else {
            serviceResult.setSuccess(false);
            serviceResult.setErrorCode(Constants.ERROR_CODE_SERVICE_PASSWD_INCORRECT);
            serviceResult.setErrorMessage("密码输入有误！");
        }
        return serviceResult;
    }


}
