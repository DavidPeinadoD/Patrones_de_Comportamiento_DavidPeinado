# ProblemaDeLaParada_DavidPeinado
 

#### Reflexión final


Este es un trabajo sobre el problema de la parada

**¿Como he abordado el problema?**

*Para realizar este trabajo he realizado un programa en el que se le introduce un programa, en este caso he utilizado dos versiones de uno:*

public class Program {
    public void run(Input input) {
        int num = input.getNum();
        do{
            System.out.println(num);
            num = num - 1;
           }while(num!=0)
        }
    }
}

public class Program {
    public void run(Input input) {
        int num = input.getNum();
        do{
            System.out.println(num);
            num = num + 1;
           }while(num!=0)
        }
    }
}
**Tengamos en cuenta que el imput para los dos casos es un numero positivo cualquiera**

*Como podemos apreciar, esta es una sintaxis muy simple y vemos claramente que en un caso nunca acabara el programa, por lo menos hasta que nos quedemos sin memoria, este problema es algo irresoluble ya que no podemos determinar en ningun momento que el bucle va a acabar en algún momento, es por ello que he modificado el metodo introduciendo una variable nueva, esta se encargara de contar el numero de iteraciones del bucle y asi determinar que el bucle se ejecutará infinitas veces, en un primer momento podriamos decir que esto es incorrecto, ya que si el bucle fuese a acabar en la iteración proxima a la que nosotros consideramos que es un bucle irresoluble nos estaríamos equivocano, como es un caso hipótetico, nos permite resolver algo imposible*

**¿Cuál su importancia en la ciencia de la computación y posibles implicaciones en otros campos de estudio o en la vida real?**

*Podríamos decir que es importante para conocer cuales son los límites de los ordenadores. También nos ayuda a darnos cuenta de que hoy en día no hay ningun algoritmo general que garantice la detección de un programa,es el caso del supuesto computador H del videdo proporcionado en el enunciado, que es imposible que exista, esto significa que verificar un código para que termine en todos las situaciones es algo que requiere mas esfuerzo cuanto más complejo es el programa. Otro caso en el que se podría implementar sería en la seguridad informática, ya quelos bucles infinitos podrían ser utilizados como "exploits".


<sub>Repositorio: DavidPeinadoD/Patrones_de_Comportamiento_DavidPeinado 
 <br>
 Hecho por David Peinado Díaz<sub/>
 
 
 
 
 
