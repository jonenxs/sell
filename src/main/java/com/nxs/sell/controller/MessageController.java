package com.nxs.sell.controller;

import com.nxs.sell.service.WebSocket;
import com.nxs.sell.utils.ResultVoUtil;
import com.nxs.sell.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private WebSocket webSocket;

    @GetMapping("/send")
    public ResultVO sendMessage(String message){
        webSocket.sendMessage(message);
        return ResultVoUtil.success();
    }

}
