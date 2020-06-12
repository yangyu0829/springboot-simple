package com.onion.common.dingtalk;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.onion.common.dingtalk.model.RobotTextMsg;

import java.util.List;

/**
 * @author: yu
 * @description: 钉钉机器人工具
 * @create: 2020-06-12 09:53
 **/
public class DingTalkRobot {

    public static void simpleSendMsg(String hookUrl, String content, List<String> atMobiles, Boolean isAtAll) {
        HttpRequest.post(hookUrl)
                .header(Header.CONTENT_TYPE, "application/json")
                .body(JSON.toJSONString(new RobotTextMsg(content, atMobiles, isAtAll)))
                .execute()
                .body();
    }
}
