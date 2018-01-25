
package com.atheneox.stacey.tables;

import com.atheneox.stacey.models.Locked;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelLocked extends AbstractTableModel{
    
    private static final long serialVersionUID = 1L;

    List<Locked> list ;

    public TableModelLocked(List<Locked> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getName();
            case 2 : return list.get(rowIndex).getDescription();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "ID";
            case 1 : return "Nombre";
            case 2 : return "Descripción";
                default:return null;
        }

    }
}