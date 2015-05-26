package com.fanya.p2p.front.home.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.solution.p2p.core.common.entity.Bid;
import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.service.BidService;
import com.solution.p2p.core.common.utils.Constants;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;
import com.solution.p2p.core.common.vo.BidQueryParams;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-12
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController extends AbstractController {

    @Reference
    private BidService bidService;

    @RequestMapping({"/",""})
    public String index(HttpServletRequest httpServletRequest, Model model) {
        Member member = getLoginMember();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.debug("request home page, user [{}]",member);
        //TODO: query banner
        //TODO: query statistic data
        /**
        BidQueryParams bidQueryParams = new BidQueryParams();
        List<Integer> bidStatusList = new ArrayList();
        bidStatusList.add(Constants.BID_STATUS_ONLINE);
        bidQueryParams.setBidStatusList(bidStatusList);
        ServiceResult<Pagination<Bid>> doingServiceResult = bidService.listBid(bidQueryParams,
                IndexConstants.HOMEPAGE_PAGE_INDEX_DOING,
                IndexConstants.HOMEPAGE_PAGE_SIZE_DOING,
                IndexConstants.APP_KEY,
                IndexConstants.APP_SECURITY);
        bidStatusList.clear();
        bidStatusList.add(Constants.BID_STATUS_COLLECT_SUCCESS);
        bidStatusList.add(Constants.BID_STATUS_REFUNDING);
        bidQueryParams.setBidStatusList(bidStatusList);
        Date begin = new Date();
        DateUtils.setHours(begin, 0);
        DateUtils.setMinutes(begin, 0);
        DateUtils.setSeconds(begin, 0);
        DateUtils.setMilliseconds(begin, 0);
        bidQueryParams.setBidSuccessTimeBegin(begin);
        Date end = new Date();
        DateUtils.setHours(end, 0);
        DateUtils.setMinutes(end, 0);
        DateUtils.setSeconds(end, 0);
        DateUtils.setMilliseconds(end, 0);
        bidQueryParams.setBidSuccessTimeEnd(end);
        ServiceResult<Pagination<Bid>> doneServiceResult = bidService.listBid(bidQueryParams,
                IndexConstants.HOMEPAGE_PAGE_INDEX_DOING,
                IndexConstants.HOMEPAGE_PAGE_SIZE_DOING,
                IndexConstants.APP_KEY,
                IndexConstants.APP_SECURITY);
        */
        //TODO: query pt notice
        //TODO: query consultation,suggestion,complaint
        //TODO: query top invest, top collect
        //TODO: query media,about,guide
        logger.info("can do something");
        return "index";
    }

    @RequestMapping("login")
    @ResponseBody
    public String ajaxLogin(HttpServletRequest httpServletRequet){
        return "";
    }
}
