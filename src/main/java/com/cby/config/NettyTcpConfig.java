package com.cby.config;

import com.cby.NettyTcpServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyTcpConfig {

    @Bean
    public Thread nettyTcpServerThread() {
        NettyTcpServer server = new NettyTcpServer(8081);
        Thread thread = new Thread(server);
        thread.setDaemon(true);
        thread.start();
        return thread;
    }
}