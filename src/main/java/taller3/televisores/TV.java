package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1; 
    private int precio=500; 
    private boolean estado; 
    private int volumen=1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV+=1;
    }

    public Marca getMarca(){
        return this.marca;
    }    
    
    public void setMarca(Marca marca){
        this.marca=marca;
    }

    public static void setNumTV(int n){
        TV.numTV=n;
    }
    public static int getNumTV(){
        return TV.numTV;
    }

    public void turnOn(){
        this.estado=true;
    }
    
    public void turnOff(){
        this.estado=false;
    }

    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if(this.estado==true){
            if(this.canal>=1 & this.canal<120){
                ++this.canal;
            }
        }
    }
    
    public void canalDown(){
        if(this.estado==true){
            if(this.canal>1 & this.canal<=120){
                --this.canal;
            }
        }
    }
    
    public void volumenUp(){
        if(this.estado==true){
            if(this.volumen>=0 & this.volumen<7){
                ++this.volumen;
            }
        }
    }
    
    public void volumenDown(){
        if(this.estado==true){
            if(this.volumen>0 & this.volumen<=7){
                --this.volumen;
            }
        }
    }
    
    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){
        if(this.estado==true){
            if (this.canal>=1 && this.canal<=120){
                this.canal=canal;
            }
        }
    }

    
    public int getPrecio(){
        return this.precio;
    }
    
    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen){
        if(this.estado==true){
            if (this.volumen>=1 && this.volumen<=7){
                this.volumen=volumen;
            }
        }
    }
    
    public Control getControl(){
        return this.control;
    }
    
    public void setPrecio(int precio){
       this.precio=precio;
    }
    
    public void setControl(Control serie){
        this.control=serie;
    }
}
