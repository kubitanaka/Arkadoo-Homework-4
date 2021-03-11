package com.gmail.shotadev103.architect.builders;

import com.gmail.shotadev103.architect.edifice.Edifice;
import com.gmail.shotadev103.architect.structure.Material;
import com.gmail.shotadev103.architect.structure.Type;

public class EdificeBuilder implements Builder {

    private String name;
    private Type type;
    private Material material;
    private int floors;
    private boolean access;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setAccess(boolean access) {
        this.access = access;
    }

    public Edifice getEdifice() {
        return new Edifice(name, type, material, floors, access);
    }
}