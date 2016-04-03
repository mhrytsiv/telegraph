package org.cdp.telegraph.presentation.controller;

import org.cdp.telegraph.facade.converter.NotificationConverter;
import org.cdp.telegraph.facade.model.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Controller
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationConverter notificationConverter;

    @Value("${my.app.property}")
    private String myAppProperty; //just to test that property is being loaded from application.properties file

    @RequestMapping("/load-notification")
    public ResponseEntity<NotificationDTO> loadNotification() {
        return ResponseEntity.ok().body(notificationConverter.convert());
    }

    @RequestMapping("/show-property")
    public ResponseEntity<String> showProperty() {
        return ResponseEntity.ok().body(myAppProperty);
    }
}
