package org.cdp.telegraph.service;

import org.cdp.telegraph.persistence.dao.NotificationDAO;
import org.cdp.telegraph.persistence.model.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Named
public class NotificationService {
    private static final Logger LOG = LoggerFactory.getLogger(NotificationService.class);

    @Inject
    private NotificationDAO notificationDAO;

    public Notification getNotification() {
        LOG.info("Inside getNotification method");
        return notificationDAO.getNotification();
    }
}
