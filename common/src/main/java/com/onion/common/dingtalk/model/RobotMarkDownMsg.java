package com.onion.common.dingtalk.model;

import java.util.List;

/**
 * @author: yu
 * @description:
 * @create: 2020-06-12 14:54
 **/
public class RobotMarkDownMsg {

    /**
     * msgtype : markdown
     * markdown : {"title":"杭州天气","text":"#### 杭州天气 @150XXXXXXXX \n> 9度，西北风1级，空气良89，相对温度73%\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\n> ###### 10点20分发布 [天气](https://www.dingalk.com) \n"}
     * at : {"atMobiles":["150XXXXXXXX"],"isAtAll":false}
     */

    private String msgtype;
    private MarkdownBean markdown;
    private AtBean at;

    /**
     * @param title     首屏会话透出的展示内容
     * @param text      markdown格式的消息
     * @param atMobiles 被@人的手机号（在text内容里要有@手机号）
     * @param isAtAll   是否@所有人
     */
    public RobotMarkDownMsg(String title, String text, List<String> atMobiles, Boolean isAtAll) {
        this.msgtype = "markdown";
        MarkdownBean textBean = new MarkdownBean();
        textBean.setText(text);
        textBean.setTitle(title);
        this.markdown = textBean;
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

    public MarkdownBean getMarkdown() {
        return markdown;
    }

    public void setMarkdown(MarkdownBean markdown) {
        this.markdown = markdown;
    }

    public AtBean getAt() {
        return at;
    }

    public void setAt(AtBean at) {
        this.at = at;
    }

    public static class MarkdownBean {
        /**
         * title : 杭州天气
         * text : #### 杭州天气 @150XXXXXXXX
         * > 9度，西北风1级，空气良89，相对温度73%
         * > ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)
         * > ###### 10点20分发布 [天气](https://www.dingalk.com)
         */

        private String title;
        private String text;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class AtBean {
        /**
         * atMobiles : ["150XXXXXXXX"]
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
