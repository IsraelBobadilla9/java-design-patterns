package com.bobadilla.estructural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEncodedMessage implements Message{
    
    private Message msg;

    
    public HtmlEncodedMessage(Message msg){
        this.msg = msg;
    }




    @Override
    public String getContent(){
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }

}
