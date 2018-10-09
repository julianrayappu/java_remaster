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
public class Rectangle implements Shape{
    private final int m_length;
    private final int m_width;
    
    public Rectangle(int length, int width)
    {
        m_length = length;
        m_width = width;
    }

    @Override
    public int area()
    {
        return m_length * m_width;
    }
    
    @Override
    public int perimeter()
    {
        return (m_length + m_width)*2;
    }
    
    @Override
    public int[] sides()
    {
        int[] sides = { m_length, m_width, m_length, m_width };
        return sides;
    }
}
