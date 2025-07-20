package com.whatsapp_platform.whatsapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {
    private String messaging_product = "whatsapp";
    private String to;
    private String type = "text";
    private Text text;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Text {
        private String body;
    }
}
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
////public class MessageRequest {
////    private String to;
////    private String type;
////    private Object message;
//}


