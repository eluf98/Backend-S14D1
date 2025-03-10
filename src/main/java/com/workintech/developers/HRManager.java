package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    // Parametresiz constructor
    public HRManager() {
        super(); // Employee sınıfının parametresiz constructor'ını çağır
        juniorDevelopers = new JuniorDeveloper[10]; // JuniorDeveloper dizisi
        midDevelopers = new MidDeveloper[10]; // MidDeveloper dizisi
        seniorDevelopers = new SeniorDeveloper[10]; // SeniorDeveloper dizisi
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5]; // 5 kişilik bir JuniorDeveloper dizisi
        midDevelopers = new MidDeveloper[5];       // 5 kişilik bir MidDeveloper dizisi
        seniorDevelopers = new SeniorDeveloper[5]; // 5 kişilik bir SeniorDeveloper dizisi
    }

    // Work method override
    @Override
    public void work() {
        System.out.println("HR manager is now working on team management.");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index > juniorDevelopers.length - 1 || index < 0) {
            System.out.println("Error: Index exceeds the capacity of the Junior Developer list.");
        } else if (juniorDevelopers[index] != null) {
            System.out.println("Error: The index is already occupied by another Junior Developer.");
        } else {
            juniorDevelopers[index] = juniorDeveloper;
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index > midDevelopers.length - 1 || index < 0) {
            System.out.println("Error: Index exceeds the capacity of the Mid Developer list.");
        } else if (midDevelopers[index] != null) {
            System.out.println("Error: The index is already occupied by another Mid Developer.");
        } else {
            midDevelopers[index] = midDeveloper;
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index > seniorDevelopers.length - 1 || index < 0) {
            System.out.println("Error: Index exceeds the capacity of the Senior Developer list.");
        } else if (seniorDevelopers[index] != null) {
            System.out.println("Error: The index is already occupied by another Senior Developer.");
        } else {
            seniorDevelopers[index] = seniorDeveloper;
        }
    }
}
