package com.education.ztu;

import com.education.ztu.game.Participant;
import com.education.ztu.game.Schoolar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("========== Демонстрація сортування ==========\n");

        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(new Schoolar("Olga", 14));
        participants.add(new Schoolar("Ivan", 13));
        participants.add(new Schoolar("Andriy", 15));
        participants.add(new Schoolar("Bohdan", 12));

        System.out.println("До сортування:");
        for (Participant p : participants) System.out.println(p);

        Collections.sort(participants);
        System.out.println("\nПісля сортування за іменем:");
        for (Participant p : participants) System.out.println(p);

        participants.sort(Comparator.comparingInt(Participant::getAge));
        System.out.println("\nПісля сортування за віком:");
        for (Participant p : participants) System.out.println(p);

        participants.sort(Comparator
                .comparing(Participant::getName)
                .thenComparingInt(Participant::getAge));
        System.out.println("\nКомбіноване сортування (ім'я, потім вік):");
        for (Participant p : participants) System.out.println(p);
    }
}