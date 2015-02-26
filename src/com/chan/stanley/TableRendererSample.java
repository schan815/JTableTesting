package com.chan.stanley;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import com.chan.stanley.Student.Grade;
 
public class TableRendererSample extends JFrame
{
    public TableRendererSample()
    {
        Student row1 = new Student(1, "John", Grade.B);
        Student row2 = new Student(2, "Rambo", Grade.A);
        Student row3 = new Student(3, "Zorro", Grade.C);
        Student row4 = new Student(4, "Rocky", Grade.A);
 
        //build the list
        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(row1);
        StudentList.add(row2);
        StudentList.add(row3);
        StudentList.add(row4);
        
         
        //create the model
        StudentTableModel model = new StudentTableModel(StudentList);
        //create the table
        JTable table = new JTable(model);
          
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Renderer Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableRendererSample();
            }
        });
    }   
}