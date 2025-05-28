package banking_system.operations;

import banking_system.models.Appointment;

public class AppointmentManager {
    public void viewAppointments(Appointment appointmentHolder) {
        for (Appointment appointment : appointmentHolder.getPriorityQueue()) {
            System.out.println("Customer: " + appointment.getCustomerName()
                    + ", Time: " + appointment.getLocalTime()
                    + ", Service: " + appointment.getServiceType());
        }
    }

    public void getNextAppointment(Appointment appointmentHolder) {
        Appointment next = appointmentHolder.getPriorityQueue().peek();
        if (next != null) {
            System.out.println("Customer: " + next.getCustomerName()
                    + ", Time: " + next.getLocalTime()
                    + ", Service: " + next.getServiceType());
        } else {
            System.out.println("No appointments available.");
        }
    }

    public void scheduleAppointment(Appointment appointmentHolder, Appointment newAppointment) {
        appointmentHolder.getPriorityQueue().add(newAppointment);
    }
}
