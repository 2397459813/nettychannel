package com.example.nettychannel.controller;

import com.example.nettychannel.nettyobject.model.Command;
import com.example.nettychannel.nettyobject.server.ContextChannel;
import org.jboss.netty.channel.Channel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageControoller {

    @GetMapping("/send")
    public String send() {
        Channel channel = ContextChannel.getInstance().getChannelMap().get("channel");
        Command command = new Command();
        command.setActionName("这是一个测试命令");
        channel.write(command);
        return "success";


    }

}
