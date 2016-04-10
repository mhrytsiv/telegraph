package org.cdp.telegraph.facade.converter;

import org.cdp.telegraph.facade.model.NotificationDTO;
import org.cdp.telegraph.persistence.model.Notification;
import org.cdp.telegraph.service.NotificationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Mykhaylo_Hrytsiv on 4/5/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class NotificationConverterTest {

    @Mock
    private NotificationService notificationServiceMock;

    @InjectMocks
    private NotificationConverter notificationConverter = new NotificationConverter();

    @Test
    public void testConvertNotificationModelToNotificationDTO() {
        // Given
        final String expectedResult = "subjectTest, bodyTest";
        final String subject = "subjectTest";
        final String body = "bodyTest";
        final Notification notification = new Notification();
        notification.setSubject(subject);
        notification.setBody(body);

        Mockito.when(notificationServiceMock.getNotification()).thenReturn(notification);

        // When
        final NotificationDTO notificationDTO = notificationConverter.convert();

        // Then
        Assert.assertEquals(expectedResult, notificationDTO.getNotificationSubjAndBody());
    }
}
