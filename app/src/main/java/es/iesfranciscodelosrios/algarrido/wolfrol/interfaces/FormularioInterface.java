package es.iesfranciscodelosrios.algarrido.wolfrol.interfaces;

public interface FormularioInterface {
    public interface View{
        void volverListado();
        void botonGuardar();
    }

    public interface Presenter{
        void botonVolver();
        void guardarFormulario();
    }
}
