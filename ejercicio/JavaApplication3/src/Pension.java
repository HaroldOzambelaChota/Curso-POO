public class Pension {
    private int categoria;
    private double promedio;

    public Pension() {
    }

    public Pension(int categoria, double promedio) {
        this.categoria = categoria;
        this.promedio = promedio;
    }

    public double calcularPension(){
        switch(categoria){
            case 0: return 550;
            case 1: return 500;
            case 2: return 460;
            default:return 400;
        }
    }
    public double calcularDescuento(){
        if(promedio<=13.99)
            return 0;
        else if(promedio <= 15.99)
            return 0.1 * calcularPension();
        else if(promedio <= 17.99)
            return 0.12 * calcularPension();
        else
            return 0.15 * calcularPension();        
    }
    public double calcularNuevaPension(){
        return calcularPension() - calcularDescuento();
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
    
    
}
