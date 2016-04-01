package org.cdp.telegraph.service;

import org.cdp.telegraph.persistence.dao.NotificationDAO;
import org.cdp.telegraph.persistence.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Service
public class NotificationService {

    @Autowired
    private NotificationDAO notificationDAO;

    public final Notification getNotification() {
        return notificationDAO.getNotification();
    }
}
