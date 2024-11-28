package LineasComado;

public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length !=3){
            System.err.println("Por favor ingresar una operacion y dos numeros (suma, resta, multi o div) y dos enteros");
            System.exit(-1);
        }
        String opeacion= args [0];
        int a=0;
        int b= 0;
        double resultado=0.00;
        try {
            a= Integer.parseInt(args[1]);
            b= Integer.parseInt(args[2]);
            resultado= 0.00;
        }catch (NumberFormatException e) {
            System.err.println("cuidado a y b deben de ser enteros, vuelva a intentar");
            System.exit(-1);
        }


        switch (opeacion){
            case "suma":
                resultado= a+b;
                break;
            case "resta":
                resultado= a-b;
                break;
            case "multi":
                resultado= a*b;
                break;
            case "div":
                if(b==0){
                    System.err.println("no se puede dividir por 0");
                    System.exit(-1);
                }
                resultado= (double)a/b;
                break;
            default:
                resultado=a+b;
        }

        System.out.println("resultado de la operacion " + opeacion+" es: " + resultado);

    }
}
