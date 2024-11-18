package com.sunkolin.pushdeer;

/**
 * MessageParam
 *
 * @author sunkolin
 * @version 1.0.0
 * @since 2024-11-18
 */
public class MessagePushParam {

    /**
     * 接口中k使用的小写，此处也适用小写
     */
    private String pushkey;

    private String text;

    public String getPushkey() {
        return pushkey;
    }

    public void setPushkey(String pushkey) {
        this.pushkey = pushkey;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
