package org.cdp.telegraph.facade.converter;

import org.cdp.telegraph.facade.model.NotificationDTO;
import org.cdp.telegraph.persistence.model.Notification;
import org.cdp.telegraph.service.NotificationService;
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
@ContextConfiguration(classes = FacadeTestContextConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class NotificationConverterTest {

    @Autowired
    private NotificationConverter notificationConverter;

    private NotificationService notificationServiceMock;

    @Before
    public void before() {
        notificationServiceMock = Mockito.mock(NotificationService.class);
        ReflectionTestUtils.setField(notificationConverter, "notificationService", notificationServiceMock);
    }

    @Test
    public void testConvert() {
        final String expectedResult = "subjectTest, bodyTest";
        final String subject = "subjectTest";
        final String body = "bodyTest";
        final Notification notification = new Notification();
        notification.setSubject(subject);
        notification.setBody(body);

        Mockito.when(notificationServiceMock.getNotification()).thenReturn(notification);

        final NotificationDTO notificationDTO = notificationConverter.convert();
        Assert.assertEquals(expectedResult, notificationDTO.getNotificationSubjAndBody());
    }
}
