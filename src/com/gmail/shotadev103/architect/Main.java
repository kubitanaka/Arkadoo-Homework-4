package com.gmail.shotadev103.architect;

import com.gmail.shotadev103.architect.builders.EdificeBuilder;
import com.gmail.shotadev103.architect.edifice.Edifice;
import com.gmail.shotadev103.architect.structure.Material;
import com.gmail.shotadev103.architect.structure.Type;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the building");
        String name = scanner.nextLine();
        System.out.println("Enter the type of building");
        Type type = Type.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter the type of material");
        Material material = Material.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter the number of floors");
        int floors = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter if the building has public access (true or false)");
        boolean access = Boolean.valueOf(scanner.nextLine());
        EdificeBuilder edificeBuilder = new EdificeBuilder();
        edificeBuilder.setName(name);
        edificeBuilder.setType(type);
        edificeBuilder.setMaterial(material);
        edificeBuilder.setFloors(floors);
        edificeBuilder.setAccess(access);
        Edifice edifice = edificeBuilder.getEdifice();
        System.out.println(edifice.print());
    }
}
