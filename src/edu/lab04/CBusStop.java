package edu.lab04;

import java.util.Arrays;

public class CBusStop {

    protected String name;
    protected String[] changes;




    public String getName() {
        return name;
    }

    public String[] getChanges() {
        return changes;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CBusStop(String name) {
        this.name = name;
    }

    public CBusStop(String name, String[] changes) {
        this.name = name;
        this.changes = changes;
    }

    public void setChanges(String... s){
        int count = s.length;
        if(count>0){
            this.changes = new String[count];
            for (int i=0; i<count; i++) this.changes[i] = s[i];
        }else{
            this.changes = null;
        }
    }




    @Override
    public String toString() {
        return " przystanek: " + name + " , przesiadki: " + ((this.changes != null) ? Arrays.toString(changes) : "-brak-");

    }
    public static int fun(int a) {return 2*a;}
}
