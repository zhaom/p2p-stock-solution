package com.solution.p2p.core.service;

import org.springframework.stereotype.Service;
import com.solution.p2p.core.common.service.AuthorizationService;
import com.solution.p2p.core.common.service.BasicServiceImpl;
import com.solution.p2p.core.common.utils.PermissionContext;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created by user on 2015/5/23.
 */
@Service
public class AuthorizationServiceImpl extends BasicServiceImpl implements AuthorizationService {
    @Override
    public ServiceResult<PermissionContext> findPermissions(String serverAppKey, String username, String appKey, String s) {
        return null;
    }
}
