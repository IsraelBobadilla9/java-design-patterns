package com.bobadilla.method.factory;

public class JSONMessage extends Message{
    

    @Override
    public String getContent(){
        return "{JOSN: }";
    }

    @Override
    public String toString() {
        return "JSONMessage []";
    }

    

}
