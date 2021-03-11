package com.gmail.shotadev103.architect.edifice;

import com.gmail.shotadev103.architect.structure.Material;
import com.gmail.shotadev103.architect.structure.Type;

public class Edifice {

    private final String name;
    private final Type type;
    private final Material material;
    private final int floors;
    private final boolean access;

    public Edifice(String name, Type type, Material material, int floors, boolean access) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.floors = floors;
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Material getMaterial() {
        return material;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isAccess() {
        return access;
    }

    public String print() {
        return "Name ="+name+", Type="+type.name()+", Material="+material.name()+", Floors="+floors+", Public="+access;
    }
}