import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Stack<Integer> A=new Stack<Integer>();
        // llenar(A,Leer.datoInt());
        // System.out.println(A);
        // Stack<Integer> Z=new Stack<Integer>();
        // vaciar(A, Z);
        // System.out.println(A);
        // System.out.println(Z);
        // //1. contar los pares e impares de z
        // impares(Z, A);
        // //2. llevar los pares a otro stack, mostrar ambas pilas
        // Stack<Integer> B=new Stack<Integer>();
        // newstack(Z, B, A);
        // System.out.println(Z);
        // System.out.println(B);

        //crear la clase mascota con atributos Nombre, Tipo, Edad
        //

        Stack<Mascota> M=new Stack<Mascota>();
        M.push(new Mascota("toto", "gato", 5));
        M.push(new Mascota("mila", "perro", 2));
        M.push(new Mascota("bruno", "gato", 3));
        M.push(new Mascota("luna", "pez", 7));
        mostrarM(M);
        lleva(M, "gato");
        System.out.println("----------------------------");
        mostrarM(M);
    }

    public static void lleva(Stack<Mascota> a, String x)
    {
        Stack<Mascota> aux1=new Stack<Mascota>();
        Stack<Mascota> aux2=new Stack<Mascota>();
        while (!a.empty()) {
            Mascota mx=a.pop();
            if (mx.getTipo().equals(x)) {
                aux1.push(mx);
            }
            else{
                aux2.push(mx);
            }
        }
        vaciarM(aux1, a);
        vaciarM(aux2, a);
    }

    public static void mostrarM(Stack<Mascota> a)
    {
        Stack<Mascota> aux=new Stack<Mascota>();
        while (!a.empty()) {
            Mascota mx=a.pop();
            mx.mostrar();
            aux.push(mx);
        }
        vaciarM(aux, a);
    }

    public static void vaciarM(Stack<Mascota> a, Stack<Mascota> b)
    {
        while (!a.empty()) {
            b.push(a.pop());
        }
    }


    public static void vaciar(Stack<Integer> a,Stack<Integer> b)
    {
        while (!a.empty()) {
            b.push(a.pop());
        }
    }

    public static void llenar(Stack<Integer> a, int n)
    {
        for (int i = 1; i <= n; i++) {
            a.push(Leer.datoInt());
        }
    }
    
    public static void impares(Stack<Integer> a, Stack<Integer> b) {
        int pares = 0;    
        int impares = 0;  
    
        while (!a.empty()) {
            int num = a.pop();
            b.push(num);
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    
        vaciar(b, a);
    }
    
    public static void newstack(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) 
    {
        while (!a.empty()) {
            c.push(a.pop());
        }
        while (!c.empty()) {
            int num=c.pop();
            if (num % 2 == 0) {
                b.push(num);
            }
            else{
                a.push(num);
            }
        }
    }
}
