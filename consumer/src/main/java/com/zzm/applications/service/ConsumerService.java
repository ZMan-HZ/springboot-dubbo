package com.zzm.applications.service;

import com.zzm.applications.provider.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * <b>Description</b>  ConsumerService
 *
 * @Author Zhenzhen
 * @Since 2020-07-15 周三 22:43
 * @Info ConsumerService
 */

@Service
public class ConsumerService {

    @DubboReference
    TicketService ticketService;

    public void helloDubbo() {
        String ticket = ticketService.getTicket();
        System.out.println("RPC: " + ticket);
    }

}
