package vandenbussche.airbussources.core;

import android.content.Context;

import java.util.ArrayList;


public class Supplier implements Namable {

    private String name;
    private ArrayList<Product> products;

    public Supplier(Context context, String name, ArrayList<Product> products){
        this.name = name;
        this.products = products;
    }

    public Supplier(Context context, String name){
        this.name = name;
    }

    public String getIdentifier(){return this.getName();}

    public String getName(){
        return this.name;
    }
}
