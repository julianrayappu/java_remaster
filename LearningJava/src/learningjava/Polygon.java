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
public class Polygon implements Shape {
    private int[] m_sides;
    
    public Polygon(int[] sides)
    {
        m_sides = sides;
    }
    
    public int area()
    {
        return perimeter() * 2;
    }
    
    public int perimeter()
    {
        int perimeter = 0;
        for( int s : m_sides)
        {
            perimeter += s;
        }
        return perimeter;
    }
    
    public int[] sides()
    {
        return m_sides;
    }
}
