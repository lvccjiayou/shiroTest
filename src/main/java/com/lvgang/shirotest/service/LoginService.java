package com.lvgang.shirotest.service;

import com.lvgang.shirotest.pojo.TalUser;

public interface LoginService {

    TalUser getUserByName(String username);

    TalUser getMapByName(String userName);
}
