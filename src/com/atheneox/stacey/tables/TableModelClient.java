package com.atheneox.stacey.tables;

import com.atheneox.stacey.models.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelClient extends AbstractTableModel{
    
    private static final long serialVersionUID = 1L;

    List<Client> list ;

    public TableModelClient(List<Client> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getName();
            case 2 : return list.get(rowIndex).getLastname();
            case 3 : return list.get(rowIndex).getCellphone();
            case 4 : return list.get(rowIndex).getDocumentType();
            case 5 : return list.get(rowIndex).getDocumentNumber();
            case 6 : return list.get(rowIndex).getId_documenttype();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "ID";
            case 1 : return "Nombre";
            case 2 : return "Apellido";
            case 3 : return "Celular";
            case 4 : return "Tipo Doc";
            case 5 : return "# Doc";
                default:return null;
        }
    }
}
