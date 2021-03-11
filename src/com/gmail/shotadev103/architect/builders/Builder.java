package com.gmail.shotadev103.architect.builders;

import com.gmail.shotadev103.architect.structure.Material;
import com.gmail.shotadev103.architect.structure.Type;

public interface Builder {

    void setName(String name);

    void setType(Type type);

    void setMaterial(Material material);

    void setFloors(int floors);

    void setAccess(boolean access);
}