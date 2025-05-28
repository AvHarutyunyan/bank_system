package banking_system.models;

import banking_system.enums.ServiceType;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Appointment {
    private String customerName;
    private LocalTime localTime;
    private ServiceType serviceType;
    private PriorityQueue<Appointment> priorityQueue = new PriorityQueue<>(
            Comparator.comparing(Appointment::getLocalTime)
    );

    public Appointment(String customerName, LocalTime localTime, ServiceType serviceType) {
        this.customerName = customerName;
        this.localTime = localTime;
        this.serviceType = serviceType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public PriorityQueue<Appointment> getPriorityQueue() {
        return priorityQueue;
    }

    public void setPriorityQueue(PriorityQueue<Appointment> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }
}
