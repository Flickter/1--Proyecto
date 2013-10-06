/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkSemestre;

import pkAula.Aulas;

/**
 *Horario que se va asignar a una asignatura
 * @author Alonso
 */
public class HorarioAsig {
    private Aulas AulaAsig;
    private int horaInicial;
    private int minutosInicial;
    private int horaFinal;
    private int minutosFinal;
    private String dia;
    
    /**
     * Horario que se asigna las materias asignadas
     * @param Aula aula que se asigna al horario donde se impartira las clases
     * @param horaIni hora inicial en la cual inicia las clases
     * @param minIni minutos cuando inicial las clases
     * @param horaFin hora final en la cual finaliza las clases
     * @param minfin minutos cuando finaliza las clases
     * @param day dia en el que se imparte la clase
     */
    public HorarioAsig(Aulas Aula, int horaIni, int minIni, int horaFin, int minfin, String day){
        AulaAsig = Aula;
        horaInicial = horaIni;
        horaFinal = horaFin;
        minutosInicial = minIni;
        minutosFinal = minfin;
        dia = day;
    }
    
    /**
     * Devuelve el aula a la cual fue asignada
     * @return un objeto de tipo Aulas
     */
    public Aulas getAulas(){
        return AulaAsig;
    }
    
    /**
     * Setea el aula asignada
     * @param val un objeto de tipo Aulas
     */
    public void setAulas(Aulas val){
        this.AulaAsig = val;
    }
    
    /**
     * Se obtiene la hora inicial del horario
     * @return un integer
     */
    public int getHoraInicial () {
        return horaInicial;
    }

    /**
     * Se setea la hora inicial del horario
     * @param val un Integer con la hora inicial
     */
    public void setHoraIniciall (int val) {
        this.horaInicial = val;
    }

    /**
     * Se devuelve los minutos de la hora inicial
     * @return Un Integer con los minutos
     */
    public int getMinutosInicial () {
        return minutosInicial;
    }
    /**
    *Setea los minutos de la hora inicial 
    * @param val Un Integer con los minutos de la hora inicial
    */
    public void setMinutosInicial (int val) {
        this.minutosInicial = val;
    }
    
    /**
     * Se obtiene la hora final del horario
     * @return un integer
     */
    public int getHoraFinal () {
        return horaFinal;
    }

    /**
     * Se setea la hora final del horario
     * @param val un Integer con la hora final
     */
    public void setHoraFinal (int val) {
        this.horaFinal = val;
    }

    /**
     * Se devuelve los minutos de la hora final
     * @return Un Integer con los minutos
     */
    public int getMinutosFinal () {
        return minutosFinal;
    }

    /**
    *Setea los minutos de la hora final
    * @param val Un Integer con los minutos de la hora final
    */
    public void setMinutosFinal (int val) {
        this.minutosFinal = val;
    }
    
    /**
     * Obtiene el dia en el cual se tiene el horario de la asignatura
     * @return Un String con el dia
     */
    public String getDia () {
        return dia;
    }

    /**
     * Setea el dia en el cual esta establecido el horario
     * @param val Un String con el dia
     */
    public void setdia (String val) {
        this.dia = val;
    }
}
