/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administra_horarios;

import Vistas.Cordinador.*;
import pkSemestre.Semestre;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.TableCellRenderer;
import pkAula.*;
import administra_horarios.Administra_horarios;
import Vistas.Cordinador.viewCalendario;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import pkSemestre.*;

/**
 *
 * @author Alonso
 */
public class metodos {
    
    /**
     * Metodo para obtener el semestre un semestre
     * @param numero Un integer con el numero de semestre a escoger
     * @param lista Un List<Semestre> con la lista de semestres
     * @return Un objeto tipo Semestre
     */
    public Semestre ObtenerSemestre(int numero, List<Semestre> lista){
        int temp = lista.size();
        for (int i=0; i<temp; i++){
            int numEle = lista.get(i).getNumero();
            if(numEle == numero){
                return lista.get(i);
            }
        }
        return null;
    }
    
    /**
     * Setea una Aula desde una lista buscandola por su numero de aula
     * @param ListaAula Una List<Aulas> donde se recibe la lista de las aulas
     * @param numAula Un String con el numero del aula que se desea buscar
     */
    public void SetearEquipoAula(List<Aulas> ListaAula, String numAula, List<Equipo> ListEqp){
        int leng = ListaAula.size();
        for(int i=0; i<leng; i++){
            try{
            if(ListaAula.get(i).getNumAula().equals(numAula)){
                aulaPractica temp = (aulaPractica)ListaAula.get(i);
                temp.setListaEquipo(ListEqp);
                return;
            }
            }catch(Exception e){  }
        }
    }
    
    /**
     * Genera el horario de un semestre
     */
    public void GenerarHorario(){
      
        String horaInicial = "";
        String horaFinal = "";
        String MinInicial = "";
        String MinFinal = "";
        String dia = "";
        String profesor = "";
        String[] columns = {"Curso","Aula","Horario","Profesor"};
        ArrayList<Vector> data = new ArrayList<>();
        
        viewCalendario.jTable1.setPreferredSize(new Dimension(500, 20));
        TableCellRenderer defaultRenderer = viewCalendario.jTable1.getDefaultRenderer(JButton.class);
        viewCalendario.jTable1.setDefaultRenderer(JButton.class, new TableButtonRenderer(defaultRenderer));
        viewCalendario.jTable1.addMouseListener(new TableButtonMouseListener(viewCalendario.jTable1));
        
        
        //jButton1.setText(String.valueOf(calendario.size()));
        List<AsignaturaSemestre> calendario = administra_horarios.Administra_horarios.SemestreActual.getListaAsigSem();
        
        for(int i=0; i < calendario.size(); i++) {
            viewCalendario.jTable1.setPreferredSize(new Dimension(500, viewCalendario.jTable1.getPreferredSize().height+16));
                        
            
            for(int j=0; j < calendario.get(i).getHorario().size(); j++) {
                Vector vector = new Vector();
                vector.add(new JButton(calendario.get(i).getAsignaturaAsig().getCodigo()));
                String aula = calendario.get(i).getHorario().get(j).getAulas().getNumAula();
                vector.add(new JButton(aula));
                dia = calendario.get(i).getHorario().get(j).getDia();
                horaInicial = Integer.toString(calendario.get(i).getHorario().get(j).getHoraInicial());
                MinInicial = Integer.toString(calendario.get(i).getHorario().get(j).getMinutosInicial());
                horaFinal = Integer.toString(calendario.get(i).getHorario().get(j).getHoraFinal());
                MinFinal = Integer.toString(calendario.get(i).getHorario().get(j).getMinutosFinal());
                profesor = calendario.get(i).getProfesorAsig().getNombre();
                vector.add(dia+" - "+horaInicial+":"+MinInicial+" - "+horaFinal+":"+MinFinal);
                vector.add(profesor);
                data.add(vector);
            }
            
        }
        
        viewCalendario.jTable1.setModel(new TableButtonModel(data,columns));
        
        viewCalendario.jTable1.setFillsViewportHeight(true);
    }
    
    /**
     * Genera la lista de materias de un semestre para mostrarlas en una Lista
     * @param Sem Semestre que contiene la lista
     */
    public void generarListaMaterias(List<AsignaturaSemestre> Sem){
        DefaultListModel modelList = new DefaultListModel();
        for(int i=0; i < Sem.size(); i++){
            String cod = Sem.get(i).getAsignaturaAsig().getCodigo();
            modelList.addElement(cod);
        }
        viewCordMaterias.jListMaterias.setModel(modelList);
    }
    
    /**
     * Genera una lista de aulas en un jlist
     * @param LiAulas Una List<Aulas> con la lista de aulas
     */
    public void generarListaAulas(List<Aulas> LiAulas){
        DefaultListModel modelList = new DefaultListModel();
        for(int i=0; i < LiAulas.size(); i++){
            String cod = LiAulas.get(i).getNumAula();
            modelList.addElement(cod);
        }
        viewCordAulas.jListAulas.setModel(modelList);
    }
    
    /**
     * Metodo para obtener la materia atravez del codigo
     * @param cod Un String con el codigo de la materia
     * @return Nos devuelve un objeto de tipo AsignaturaSemestre
     */
    public AsignaturaSemestre obtenerMateria(String cod){
        List<AsignaturaSemestre> Lista = Administra_horarios.SemestreActual.getListaAsigSem();
        for(int i=0; i<Lista.size(); i++){
            String temp = Lista.get(i).getAsignaturaAsig().getCodigo();
            if(temp.equals(cod)){
             return Lista.get(i);
            }
        }
        return null;
    }
    
    public Semestre GenerarSemestre(Semestre semestre){
        
        boolean Generar = true;
        for(int i=0; i< semestre.getListaAsigSem().size(); i++){
            AsignaturaSemestre tempAsig = semestre.getListaAsigSem().get(i);
            String nomProfe = tempAsig.getProfesorAsig().getCedula();
            for(int k=0; k< tempAsig.getHorario().size(); k++){
                int hInicial = tempAsig.getHorario().get(k).getHoraInicial();
                int hFinal = tempAsig.getHorario().get(k).getHoraFinal();
                int mInicial = tempAsig.getHorario().get(k).getMinutosInicial();
                int mFinal = tempAsig.getHorario().get(k).getMinutosFinal();
                String nomAula = tempAsig.getHorario().get(k).getAulas().getNumAula();
                String nomDia = tempAsig.getHorario().get(k).getDia();
                
                
                for(int h=0; h<semestre.getListaAsigSem().size(); h++){
                    AsignaturaSemestre tempAsigCompro = semestre.getListaAsigSem().get(i);
                    for(int m=0; m< tempAsigCompro.getHorario().size(); m++){
                        int hInicialCompro = tempAsigCompro.getHorario().get(m).getHoraInicial();
                        int hFinalCompro = tempAsigCompro.getHorario().get(m).getHoraFinal();
                        int mInicialCompro = tempAsigCompro.getHorario().get(m).getMinutosInicial();
                        int mFinalCompro = tempAsigCompro.getHorario().get(m).getMinutosFinal();
                        String nomAulaCompro = tempAsigCompro.getHorario().get(m).getAulas().getNumAula();
                        String nomDiaCompro = tempAsigCompro.getHorario().get(m).getDia();
                        
                        if(tempAsig != tempAsigCompro){
                            boolean aulas = nomAula.equals(nomAulaCompro);
                            boolean dias = nomDia.equals(nomDiaCompro);
                            boolean hora = true;
                            int Inicio =0;
                            int fin = 0;
                            if(hInicial>hInicialCompro){
                                Inicio = hInicial;
                                fin = hFinal;
                                if(hInicialCompro<Inicio &&hFinalCompro>fin)
                                    hora = false;
                            }else{
                                Inicio = hInicialCompro;
                                fin = hFinalCompro;
                                if(hInicial<Inicio &&hFinal>fin)
                                    hora = false;
                            }
                            if(hora = false)
                                Generar = false;
                        } 
                    }
                }
            } 
        }
        if (Generar == true){
            return semestre;
        }
        return null;
    }
    
    
}


class TableButtonRenderer extends JButton implements TableCellRenderer {
    
    private TableCellRenderer defaultRenderer;

    public TableButtonRenderer(TableCellRenderer renderer) {
        defaultRenderer = renderer;
    }

    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
    {
        if(value instanceof Component)
            return (Component)value;
        return defaultRenderer.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
    }
    
    
}

class TableButtonModel extends AbstractTableModel {
    
    private ArrayList<Vector> rows;
    private String[] columns;

    public TableButtonModel(ArrayList<Vector> data, String[] column) {
        rows = data;
        columns = column;
    }
   
    @Override
    public String getColumnName(int column) { 
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) { 
        for(int i=0; i < rows.size(); i++) {
            for(int j=0; j < rows.get(i).size(); j++) {
                if(i==row & j==column)
                    return rows.get(i).get(j);
            }
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
}

class TableButtonMouseListener implements MouseListener {
    private JTable table;
    JButton button;
    JInternalFrame window = new JInternalFrame("ventana");
    
    private void EventToButton(MouseEvent e) {
        TableColumnModel columnModel = table.getColumnModel();
        int column = columnModel.getColumnIndexAtX(e.getX());
        int row    = e.getY() / table.getRowHeight();
        Object value;
        
        MouseEvent buttonEvent;

        if(row >= table.getRowCount() || row < 0 || column >= table.getColumnCount() || column < 0)
            return;

        value = table.getValueAt(row, column);

        if(!(value instanceof JButton))
            return;

        button = (JButton)value;
        buttonEvent = (MouseEvent)SwingUtilities.convertMouseEvent(table, e, button);
        button.dispatchEvent(buttonEvent);
        // This is necessary so that when a button is pressed and released
        // it gets rendered properly.  Otherwise, the button may still appear
        // pressed down when it has been released.
        table.repaint();
    }

    public TableButtonMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        window.setPreferredSize(new Dimension(100, 100));
        window.repaint();
        window.show();
        
        EventToButton(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        EventToButton(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        EventToButton(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        EventToButton(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        EventToButton(e);
    }
}