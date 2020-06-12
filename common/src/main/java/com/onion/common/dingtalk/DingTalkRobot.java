package com.onion.common.dingtalk;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.onion.common.dingtalk.model.RobotLinkMsg;
import com.onion.common.dingtalk.model.RobotMarkDownMsg;
import com.onion.common.dingtalk.model.RobotTextMsg;
import org.checkerframework.checker.units.qual.A;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

/**
 * @author: yu
 * @description: 钉钉机器人工具
 * @create: 2020-06-12 09:53
 **/
public class DingTalkRobot {


    /**
     * 发送文本消息
     *
     * @param hookUrl   webhook 地址
     * @param content   内容
     * @param atMobiles @的人手机号
     * @param isAtAll   是否@全体
     */
    public static String simpleSendMsg(String hookUrl, String content, List<String> atMobiles, Boolean isAtAll) {
        Assert.notNull(hookUrl, "webhook地址不能为空");
        Assert.notNull(content, "文本内容不能为空");
        String response = HttpRequest.post(hookUrl)
                .header(Header.CONTENT_TYPE, "application/json")
                .body(JSON.toJSONString(new RobotTextMsg(content, atMobiles, isAtAll)))
                .execute()
                .body();
        return response;
    }

    /**
     * 发送链接类型的消息
     *
     * @param hookUrl    wenhook地址
     * @param title      标题
     * @param text       简介
     * @param messageUrl 链接 url
     * @param picUrl     图片url
     */
    public static String simpleSendLinkMsg(String hookUrl, String title, String text, String messageUrl, String picUrl) throws Exception {
        Assert.notNull(hookUrl, "webhook地址不能为空");
        Assert.notNull(title, "首屏标题展示内容不能为空");
        Assert.notNull(text, "消息内容不能为空");
        String response = HttpRequest.post(hookUrl)
                .header(Header.CONTENT_TYPE, "application/json")
                .body(JSON.toJSONString(new RobotLinkMsg(title, text, messageUrl, picUrl)))
                .execute()
                .body();
        return response;
    }


    /**
     * 发送markdown 消息
     *
     * @param hookUrl   wenhook地址
     * @param title     标题
     * @param text      简介
     * @param atMobiles 被@人的手机号（在text内容里要有@手机号）
     * @param isAtAll   是否@所有人
     * @return
     * @throws Exception
     */
    public static String simpleSendMarkDownMsg(String hookUrl, String title, String text, List<String> atMobiles, Boolean isAtAll) throws Exception {
        Assert.notNull(hookUrl, "webhook地址不能为空");
        Assert.notNull(title, "首屏标题展示内容不能为空");
        Assert.notNull(text, "markdown格式的消息不能为空");
        String response = HttpRequest.post(hookUrl)
                .header(Header.CONTENT_TYPE, "application/json")
                .body(JSON.toJSONString(new RobotMarkDownMsg(title, text, atMobiles, isAtAll)))
                .execute()
                .body();
        return response;
    }


    /**
     * 根据 secret 进行加密处理 返回 url拼接串
     *
     * @param secret
     * @return
     * @throws Exception
     */
    public static String sign(String secret) throws Exception {
        Long timestamp = System.currentTimeMillis();

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(Base64.getEncoder().encodeToString(signData), "UTF-8");
        return "&timestamp=" + timestamp + "&sign=" + sign;
    }
}
