package com.lvgang.shirotest.service.login;

import com.lvgang.shirotest.pojo.TalUser;
import com.lvgang.shirotest.service.LoginService;
import org.springframework.stereotype.Service;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
    @Override
    public TalUser getUserByName(String username) {
        return null;
    }

    @Override
    public TalUser getMapByName(String userName) {
        return null;
    }
}
