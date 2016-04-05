package org.cdp.telegraph.service;

import org.cdp.telegraph.persistence.dao.NotificationDAO;
import org.cdp.telegraph.persistence.model.Notification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Created by Mykhaylo_Hrytsiv on 4/5/2016.
 */
@ContextConfiguration(locations = "classpath:service-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class NotificationServiceTest {

    @Autowired
    private NotificationService notificationService;

    private NotificationDAO notificationDAOMock;

    @Before
    public void before() {
        notificationDAOMock = Mockito.mock(NotificationDAO.class);
        ReflectionTestUtils.setField(notificationService, "notificationDAO", notificationDAOMock);
    }

    @Test
    public void testGetNotification() {
        final String subject = "subjectTest";
        final String body = "bodyTest";
        final Notification notification = new Notification();
        notification.setSubject(subject);
        notification.setBody(body);

        Mockito.when(notificationDAOMock.getNotification()).thenReturn(notification);

        final Notification notificationActual = notificationService.getNotification();
        Assert.assertEquals(subject, notificationActual.getSubject());
        Assert.assertEquals(body, notificationActual.getBody());
    }
}
