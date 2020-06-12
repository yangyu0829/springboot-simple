package com.onion.common.dingtalk.model;

import java.util.List;

/**
 * @author: yu
 * @description: 钉钉机器人 文本消息类
 * @create: 2020-06-12 09:56
 **/
public class RobotTextMsg {

    /**
     * msgtype : text
     * text : {"content":"我就是我, 是不一样的烟火@156xxxx8827"}
     * at : {"atMobiles":["156xxxx8827","189xxxx8325"],"isAtAll":false}
     */

    private String msgtype;
    private TextBean text;
    private AtBean at;

    public RobotTextMsg(String content, List<String> atMobiles, Boolean isAtAll) {
        this.msgtype = "text";
        TextBean textBean = new TextBean();
        textBean.setContent(content);
        this.text = textBean;
        AtBean atBean = new AtBean();
        atBean.setAtMobiles(atMobiles);
        if (isAtAll != null) {
            atBean.setIsAtAll(isAtAll);
        }
        this.at = atBean;

    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public TextBean getText() {
        return text;
    }

    public void setText(TextBean text) {
        this.text = text;
    }

    public AtBean getAt() {
        return at;
    }

    public void setAt(AtBean at) {
        this.at = at;
    }

    public static class TextBean {
        /**
         * content : 我就是我, 是不一样的烟火@156xxxx8827
         */

        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class AtBean {
        /**
         * atMobiles : ["156xxxx8827","189xxxx8325"]
         * isAtAll : false
         */

        private boolean isAtAll;
        private List<String> atMobiles;

        public boolean isIsAtAll() {
            return isAtAll;
        }

        public void setIsAtAll(boolean isAtAll) {
            this.isAtAll = isAtAll;
        }

        public List<String> getAtMobiles() {
            return atMobiles;
        }

        public void setAtMobiles(List<String> atMobiles) {
            this.atMobiles = atMobiles;
        }
    }
}
