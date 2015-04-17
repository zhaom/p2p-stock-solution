package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.utils.PermissionContext;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created by johnKee on 2015/4/16.
 */
public interface AuthorizationService {

    ServiceResult<PermissionContext> findPermissions(String serverAppKey, String username, String appKey, String s);

}
