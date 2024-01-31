package main.java.controller;

import main.java.model.Medication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicationController {

    private List<Medication> medications;

    public MedicationController() {
        this.medications = new ArrayList<>();
    }

    public void addMedication(String name, Date expirationDate) {
        Medication newMedication = new Medication(name, expirationDate);
        medications.add(newMedication);
        System.out.println("Medication added: " + name);
    }

    public void updateMedication(String name, Date newExpirationDate) {
        for (Medication medication : medications) {
            if (medication.getName().equals(name)) {
                medication.setExpirationDate(newExpirationDate);
                System.out.println("Medication updated: " + name);
                return;
            }
        }
        System.out.println("Medication not found: " + name);
    }

    public void removeMedication(String name) {
        medications.removeIf(medication -> medication.getName().equals(name));
        System.out.println("Medication removed: " + name);
    }

    public void listMedications() {
        System.out.println("List of Medications:");
        for (Medication medication : medications) {
            printMedicationDetails(medication);
        }
    }

    public void checkMedicationStatus() {
        Date currentDate = new Date();
        for (Medication medication : medications) {
            printMedicationStatus(medication, currentDate);
        }
    }

    private void printMedicationDetails(Medication medication) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Name: " + medication.getName() +
                ", Expiration Date: " + dateFormat.format(medication.getExpirationDate()));
    }

    private void printMedicationStatus(Medication medication, Date currentDate) {
        if (medication.getExpirationDate().before(currentDate)) {
            System.out.println("Medication expired: " + medication.getName());
        } else {
            System.out.println("Medication OK: " + medication.getName());
        }
    }
}
