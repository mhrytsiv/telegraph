package org.cdp.telegraph.persistence.dao;

import org.cdp.telegraph.persistence.model.Notification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Mykhaylo_Hrytsiv on 4/5/2016.
 */
@ContextConfiguration(locations = "classpath:persistence-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class NotificationDAOTest {

    @Autowired
    private NotificationDAO notificationDAO;

    @Test
    public void testGetNotification() {
        final Notification notification = notificationDAO.getNotification();
        Assert.assertEquals("notificationSubjectTest", notification.getSubject());
        Assert.assertEquals("notificationBodyTest", notification.getBody());
    }
}
