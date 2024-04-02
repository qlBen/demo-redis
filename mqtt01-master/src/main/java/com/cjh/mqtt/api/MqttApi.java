package com.cjh.mqtt.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjh.mqtt.sendclient.Send_Client;



@RestController
@RequestMapping("/mqtt")
public class MqttApi {

	/**
	 *  http:/localhost:9091/mqtt/sendmsg
	 */
    @Autowired
    private Send_Client  client1;

    @GetMapping(value = "/sendmsg")
    public Object publishTopic(String sendMessage) {
        sendMessage= "123324322";
        client1.publish(false ,"wwj",sendMessage);
        return null;
    }

}

