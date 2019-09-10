/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youssef
 */
public class Variables {
    
    public String name;
    public String type;
    public String value="garbage";
    public String Count;
    public String access;
    public int Context;
    public int Accessible;
    public Variables(String names,String types,String values,String Counts,String accesss, int cont,int acc )
    {
        name = names;
        type = types;
        value = values;
        Count=Counts;
        access = accesss;
        Context=cont;
        Accessible=acc;
    }
    
    
    
}
