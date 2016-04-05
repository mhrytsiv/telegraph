package org.cdp.telegraph.facade.converter;

import org.apache.commons.lang3.StringUtils;
import org.cdp.telegraph.facade.annotation.Facade;
import org.cdp.telegraph.facade.model.NotificationDTO;
import org.cdp.telegraph.persistence.model.Notification;
import org.cdp.telegraph.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Facade
public class NotificationConverter {
    private static final Logger LOG = LoggerFactory.getLogger(NotificationConverter.class);

    @Autowired
    private NotificationService notificationService;

    public final NotificationDTO convert() {
        LOG.info("Convert Notification object to NotificationDTO object");
        final NotificationDTO notificationDTO = new NotificationDTO();
        final Notification notification = notificationService.getNotification();
        notificationDTO.setNotificationSubjAndBody(StringUtils.join(notification.getSubject(),
                ", ", notification.getBody()));
        return notificationDTO;
    }
}
