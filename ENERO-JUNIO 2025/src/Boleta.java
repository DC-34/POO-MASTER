public class Boleta {
    String nombre;
    int control;
    double poo;
    double calculo_integral;
    double algebra_lineal;
    double cont_finan;
    double prob_y_estadistica;
    double quimica;



    String obtenerDatos() {
        String cad="";
        cad=cad+"nombre: "+nombre+"; ";
        cad=cad+"numero de control: "+control+"; ";
        cad=cad+"calificacion poo: "+poo+"; ";
        cad=cad+"calificacion calculo integral: "+calculo_integral+"; ";
        cad=cad+"calificacion algebra lineal: "+algebra_lineal+"; ";
        cad=cad+"calificacion contabilidad financiera: "+cont_finan+"; ";
        cad=cad+"calificacion probabilidad y estadistica: "+prob_y_estadistica+"; ";
        cad=cad+"calificacion quimica: "+quimica+"; ";

        return cad;
    }


}
