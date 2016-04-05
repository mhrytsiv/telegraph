package org.cdp.telegraph.persistence.dao;

import org.cdp.telegraph.persistence.model.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
public class NotificationDAO {
    private static final Logger LOG = LoggerFactory.getLogger(NotificationDAO.class);

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String argSubject) {
        this.subject = argSubject;
    }

    public Notification getNotification() {

        final Notification notification = new Notification();
        notification.setSubject(getSubject());
        notification.setBody("notificationBodyTest");
        LOG.info(MessageFormatter.format("Created test Notification object: {}", notification.toString()).getMessage());
        return notification;
    }
}
