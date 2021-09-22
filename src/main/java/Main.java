public class Main {
    public static void main(String [] args){
        int iDeMain=0;
        cambiarValorAInt(iDeMain);
        System.out.println(iDeMain);

        MiClase miClase=new MiClase();
        cambiarValorAClase(miClase);
        System.out.println(miClase.i);
    }
    public static void cambiarValorAInt(int iDeFuncion){
        iDeFuncion++;
    }
    public static void cambiarValorAClase(MiClase miClase){
        miClase.i++;
    }

}
