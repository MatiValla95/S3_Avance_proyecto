public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Avanzar(int porcentaje) {
        if (porcentaje>=0 && porcentaje<=100){
            this.progreso = porcentaje;
        }
        if (this.progreso==100){
            terminado= true;
        } else {
            terminado= false;
        }

    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getProgreso() {
        return progreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }
}
