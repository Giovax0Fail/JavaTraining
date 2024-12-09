
// Espressione
public class SwitchStatementVsExpression {
    public static void main(String[] args) {
        int x = 20;
        
        String nome = switch(x) {
            case 10 -> {
                yield "dieci";
            }
            case 20 -> {
                yield "venti";
            }
            default -> {
                yield "qualunque";
            }
        };

        System.out.println(nome);
    }
}




//Switch statement
/*String nome;
int x = 20;
switch(x) {
        case 10:
nome = "dieci";
        break;
        case 20:
nome = "venti";
        break;
default:
nome = "qualunque";
        break;
}
        System. out.println(nome);*/

/*------------------------------------------*/
//column case case 10: arrow case case->10

/*
int x = 20;
String nome = switch(x) {
case 10 -> "dieci";  rende superfluo il yield
case 20 -> "venti";
default -> "qualunque";

};

System. out.println(nome);
*/

/*arrow case con blocchi di codice
case 10 -> {
System. out.println("torno 'dieci'");
yield "dieci";
 */