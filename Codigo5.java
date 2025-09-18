import java.util.Scanner; 
//Antes faltaba importar Scanner
//Ahora se importa correctamente

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        //Antes: Scanner s = new Scanner(); → faltaba System.in
        //Ahora: se pasa System.in al constructor correctamente

        System.out.print("Introduzca un número: "); 
        //Antes: comillas mal cerradas (' en vez de ")
        //Ahora: comillas corregidas y línea dentro del método

        String ni = s.nextLine(); 
        //Esto estaba bien desde el inicio

        int c = Integer.parseInt(ni); 
        //Antes: int c = ni; → no se puede asignar String a int
        //Ahora: se convierte el String a int con Integer.parseInt()

        int numero = c; 
        //Antes no existía esta variable extra, se intentaba operar con String ni
        //Ahora se usa una copia entera del número para procesar los dígitos

        int afo = 0; 
        int noAfo = 0; 
        //Estas inicializaciones estaban correctas

        while (numero > 0) { 
            //Antes: while (ni > 0) → ni es String, no se puede comparar así
            //Ahora: se compara con el número entero (int)

            int digito = numero % 10; 
            //Extracción del dígito está bien

            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++; 
             // Correcta identificación de dígitos "afortunados"
            } else {
                noAfo++; 
                // ✅ Los demás dígitos cuentan como "no afortunados"
            }

            numero /= 10; 
            //Antes: esto estaba dentro del else → causaba errores lógicos
            //Ahora: se ejecuta siempre en cada iteracción
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado."); 
            //Antes: System.out.prinln → error de sintaxis
            //Ahora: println escrito correctamente
        } else {
            System.out.println("El " + c + " no es un número afortunado."); 
            //Línea corregida y funcional
        }
    }
}

	}