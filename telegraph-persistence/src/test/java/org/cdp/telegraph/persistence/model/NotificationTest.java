package org.cdp.telegraph.persistence.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
public class NotificationTest {

    @Test
    public void testNotification() {
        final String subject = "SubjectTest";
        final Notification notification = new Notification();
        notification.setSubject(subject);
        Assert.assertEquals(subject, notification.getSubject());
    }
}
