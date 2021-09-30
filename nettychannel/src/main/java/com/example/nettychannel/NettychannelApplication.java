package com.example.nettychannel;

import com.example.nettychannel.nettyobject.server.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettychannelApplication {

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        SpringApplication.run(NettychannelApplication.class, args);
    }

}
