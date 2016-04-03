package org.cdp.telegraph.service;

import org.cdp.telegraph.persistence.dao.NotificationDAO;
import org.cdp.telegraph.persistence.model.Notification;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Named
public class NotificationService {

    @Inject
    private NotificationDAO notificationDAO;

    public final Notification getNotification() {
        return notificationDAO.getNotification();
    }
}
