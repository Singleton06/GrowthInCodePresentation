package com.bdorganization.javatypes;

public class AppointmentRemoveStatus
{
    public enum Status
    {
        SUCCESS, FAILURE;
    }

    private final Status status;

    public AppointmentRemoveStatus(Status status)
    {
        this.status = status;
    }

    public Status getStatus()
    {
        return status;
    }
}