package com.example.nettychannel.nettyobject.server;

import org.jboss.netty.channel.Channel;

import java.util.HashMap;
import java.util.Map;

public class ContextChannel {

    private ContextChannel() {

    }

    private static class SingletonInner {
        private static ContextChannel instance = new ContextChannel();
    }

    public static ContextChannel getInstance() {

        return SingletonInner.instance;
    }

    private static Map<String, Channel> channelMap = new HashMap<String, Channel>();

    public static Map<String, Channel> getChannelMap() {
        return channelMap;
    }

    public static void setChannelMap(Map<String, Channel> channelMap) {
        ContextChannel.channelMap = channelMap;
    }
}
