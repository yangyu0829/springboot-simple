package com.onion.common.dingtalk.model;

/**
 * @author: yu
 * @description:
 * @create: 2020-06-12 14:18
 **/
public class RobotLinkMsg {

    /**
     * msgtype : link
     * link : {"text":"这个即将发布的新版本，创始人xx称它为红树林。而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是红树林","title":"时代的火车向前开","picUrl":"","messageUrl":"https://www.dingtalk.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI"}
     */

    private String msgtype;
    private LinkBean link;

    /**
     * @param title      消息标题
     * @param text       消息内容。如果太长只会部分展示
     * @param messageUrl 点击消息跳转的URL
     * @param picUrl     图片URl
     */
    public RobotLinkMsg(String title, String text, String messageUrl, String picUrl) {
        this.msgtype = "link";
        LinkBean linkBean = new LinkBean();
        linkBean.setText(text);
        linkBean.setTitle(title);
        linkBean.setMessageUrl(messageUrl);
        linkBean.setPicUrl(picUrl);
        this.link = linkBean;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public LinkBean getLink() {
        return link;
    }

    public void setLink(LinkBean link) {
        this.link = link;
    }

    public static class LinkBean {
        /**
         * text : 这个即将发布的新版本，创始人xx称它为红树林。而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是红树林
         * title : 时代的火车向前开
         * picUrl :
         * messageUrl : https://www.dingtalk.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI
         */

        private String text;
        private String title;
        private String picUrl;
        private String messageUrl;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getMessageUrl() {
            return messageUrl;
        }

        public void setMessageUrl(String messageUrl) {
            this.messageUrl = messageUrl;
        }
    }
}
