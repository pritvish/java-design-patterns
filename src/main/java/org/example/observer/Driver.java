package org.example.observer;

public class Driver {
    public static void main(String[] args) {

//        Create Observer
        Employee employee = new Employee();
        Manager manager = new Manager();

//        Create Observable
        OfficeUpdates officeUpdates = new OfficeUpdates();
        OfficeUpdates emergencyOfficeUpdates = new EmergencyOfficeUpdates();

        officeUpdates.subscribe(employee);
        officeUpdates.subscribe(manager);
//        officeUpdates.unsubscribe(employee);

        emergencyOfficeUpdates.subscribe(employee);
        emergencyOfficeUpdates.subscribe(manager);

        officeUpdates.notifySubscribers("New notice has been put up... check inbox");
        emergencyOfficeUpdates.notifySubscribers("Emergency meeting is scheduled ... assemble immediately");

    }
}
