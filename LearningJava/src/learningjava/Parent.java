package learningjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suppiah_00
 */
public class Parent {
    private int m_id;
    private static int counter;
    
    private String m_name;
    
    public Parent()
    {
        counter++;
        m_id = counter;
    }
            
    public Parent(String name)
    {
        this();
        m_name = name;
    }
    
    @Override
    public String toString()
    {
        return "Parent[" + m_id + ", " + m_name + "]";
    }
}
