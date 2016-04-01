package org.cdp.telegraph.persistence.dao;


import org.cdp.telegraph.persistence.model.Notification;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
public class NotificationDAO {

    private String subject;

    public final String getSubject() {
        return subject;
    }

    public final void setSubject(final String argSubject) {
        this.subject = argSubject;
    }

    public final Notification getNotification() {
        final Notification notification = new Notification();
        notification.setSubject(getSubject());
        notification.setBody("notificationBodyTest");
        return notification;
    }
}
