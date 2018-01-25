package com.atheneox.horizontefrances.tables;

import com.atheneox.horizontefrances.models.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelCollection extends AbstractTableModel {
        private static final long serialVersionUID = 1L;

    List<Collection> list ;

    public TableModelCollection(List<Collection> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //case 0 : return list.get(rowIndex).getId();
            //case 6 : return list.get(rowIndex).getModel_Id();
            //case 7 : return list.get(rowIndex).getSubmodel_Id();
            case 0 : return list.get(rowIndex).getHight_cm();
            case 1 : return list.get(rowIndex).getWidth_cm();
            case 2 : return list.get(rowIndex).getHight_in();
            case 3 : return list.get(rowIndex).getWidth_in();
            case 4 : return list.get(rowIndex).getPrice();
            case 5 : return list.get(rowIndex).getModel();
            case 6 : return list.get(rowIndex).getSubModel();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            //case 0 : return "ID";
            //case 6 : return "model_id";
            //case 7 : return "submodel_id";
            case 0 : return "Alto cm";
            case 1 : return "Ancho cm";
            case 2 : return "Alto in";
            case 3 : return "Ancho in";
            case 4 : return "Precio";
            case 5 : return "Modelo";
            case 6 : return "Submodelo";

                default:return null;
        }
    }
}
