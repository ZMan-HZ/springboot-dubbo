package com.zzm.applications.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>  TicketSeriveImpl
 *
 * @Author Zhenzhen
 * @Since 2020-07-15 周三 22:11
 * @Info TicketSeriveImpl
 */

@Component
@DubboService
//发布服务
public class TicketSeriveImpl implements TicketService {


    @Override
    public String getTicket() {
        return "Hello, Dubbo!";
    }
}
