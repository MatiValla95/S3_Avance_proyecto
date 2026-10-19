public class MainProyecto {
    static void main() {
        Proyecto p1 = new Proyecto();
        p1.setNombre("web") ;
        p1.setResponsable("pepito");
        p1.Avanzar(-5);
        System.out.println("el nombre del proyecto es: " + p1.getNombre() + " El responsable del proyeccto es: " + p1.getResponsable() + " el progreso del proyecto es de:"+ p1.getProgreso() + "%");
        System.out.println("Su proyecto esta terminado?"+ p1.isTerminado());

    }

}
