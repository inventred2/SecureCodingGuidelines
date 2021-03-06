package be.howest.ti.secure.development.g6.g12;

import java.util.Arrays;
import java.util.List;

public class ExampleAttackG6G12 {
    public static void main(String[] args){
        printLists("Starting..");

        List lstTampered = Arrays.asList("tamper1","tamper2","...");
        ExampleG6G12.lstAttackable = lstTampered;
        printLists("Tampered lstAttackable 1");

        ExampleG6G12.lstAttackable.set(0,"Tampered!!");
        printLists("Tampered lstAttackable 2");

        ExampleG6G12.lstBetter.set(0,"PROBLEM ?!");
        printLists("Tampered lstBetter 1");

        //ExampleG6G12.lstBetter = lstTampered; // ==> Error: Cannot assign a value to final variable lstBetter

        // try to replace the value of the first element
        try {
            ExampleG6G12.lstBest.set( 0, "tamper" );
        }catch (UnsupportedOperationException ex){
            System.out.println("-> Error when trying to ExampleG6G12.lstBest.set( 0, \"tamper\" )");
            ex.printStackTrace(System.out);
            System.out.println();
        }

    }

    private static void printLists(String comment){
        System.out.println(comment);
        System.out.println("lstAttackable: " + ExampleG6G12.lstAttackable.toString());
        System.out.println("lstBetter: " + ExampleG6G12.lstBetter.toString());
        System.out.println("lstBest: " + ExampleG6G12.lstBest.toString());
        System.out.println();
    }
}
