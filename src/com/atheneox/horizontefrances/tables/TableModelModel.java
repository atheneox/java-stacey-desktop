package com.atheneox.horizontefrances.tables;

import com.atheneox.horizontefrances.models.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelModel extends AbstractTableModel{
    
    private static final long serialVersionUID = 1L;

    List<Model> list ;

    public TableModelModel(List<Model> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
          //  case 0 : return list.get(rowIndex).getId();
            case 0 : return list.get(rowIndex).getName();
            case 1 : return list.get(rowIndex).getDescription();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            //case 0 : return "ID";
            case 0 : return "Nombre";
            case 1 : return "Descripción";
                default:return null;
        }
    }
    
}
