package com.bdorganization.listeneradapter.bad.growth;

@SuppressWarnings({ "javadoc" })
public class AppointmentManager
{
    public void createAppointment(AppointmentManagerListener listener)
    {
        // in certain situations, the creation might fail
        listener.appointmentCreationFailed(null);

        // or this would call the appointment created method with information about the created
        // appointment on the event.
        listener.appointmentCreated(null);

    }
}
