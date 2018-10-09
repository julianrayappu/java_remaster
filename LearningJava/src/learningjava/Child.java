/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

/**
 *
 * @author suppiah_00
 */
public class Child extends Parent
{
    private int m_age;
    
    public Child(String name, int age)
    {
        super(name);
        m_age = age;
    }
    
    @Override
    public String toString()
    {
        return "Child[" + super.toString() + ", age=" + m_age + "]";
    }
    
}
