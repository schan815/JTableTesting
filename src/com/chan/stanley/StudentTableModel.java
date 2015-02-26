package com.chan.stanley;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.chan.stanley.Student.Grade;

public class StudentTableModel extends AbstractTableModel {
	private final List<Student> studentList;

	private final String[] columnNames = new String[] { "Id", "Name", "Grade" };
	private final Class[] columnClass = new Class[] { Integer.class, String.class, Grade.class };

	public StudentTableModel(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return studentList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student row = studentList.get(rowIndex); //find row for object, three conditionals below finds variables of the row object
		if (0 == columnIndex) {
			return row.getId();
		} else if (1 == columnIndex) {
			return row.getName();
		} else if (2 == columnIndex) {
			return row.getGrade();
		}
		return null;
	}
}