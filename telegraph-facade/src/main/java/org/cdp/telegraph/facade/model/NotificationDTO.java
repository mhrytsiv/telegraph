package org.cdp.telegraph.facade.model;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
public class NotificationDTO {

    private String notificationSubjAndBody;

    public final String getNotificationSubjAndBody() {
        return notificationSubjAndBody;
    }

    public final void setNotificationSubjAndBody(final String argNotificationSubjAndBody) {
        this.notificationSubjAndBody = argNotificationSubjAndBody;
    }
}
