/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administra_horarios;

import pkSemestre.Semestre;
import java.util.List;

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
    
    
    
    
}
