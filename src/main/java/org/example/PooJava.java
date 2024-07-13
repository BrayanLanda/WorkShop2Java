package org.example;

public class PooJava {
    public static void main(String[] args) {
        /*
        ---Abstraccion
           **Definicion:
           La abstracción consiste en ocultar los detalles de implementación complejos y mostrar solo
           la funcionalidad esencial del objeto. Permite centrarse en lo que hace un objeto en lugar de cómo lo hace.

           **Ejemplo:
           En un sistema bancario, una clase CuentaBancaria puede abstraer los detalles de
            cómo se almacenan y gestionan los datos de la cuenta, proporcionando métodos como
             depositar, retirar y consultarSaldo para interactuar con la cuenta.

         ---Encapsulamiento
            ***Definicion:
            El encapsulamiento es el mecanismo que permite agrupar datos y métodos que operan sobre esos datos
            dentro de una clase, y controlar el acceso a esos datos a través de modificadores de acceso
            (como private, protected y public). Protege el estado interno del objeto y sólo permite su modificación
            a través de métodos definidos.

            **Ejemplo:
            Continuando con el ejemplo de CuentaBancaria, el saldo está encapsulado y
            no puede ser modificado directamente desde fuera de la clase.

         ---Herencia:
            **Deficion:
            La herencia permite crear nuevas clases que reutilizan, extienden y modifican el comportamiento
            de las clases existentes. La clase existente se llama superclase (o clase base) y la nueva clase
            se llama subclase (o clase derivada).

            **Ejemplo:
            Una clase CuentaCorriente y una clase CuentaAhorros pueden heredar de CuentaBancaria, añadiendo
            o modificando funcionalidades específicas.

         ---Polimorfismo
            **Definicion
            El polimorfismo permite usar una interfaz común para interactuar con diferentes tipos de objetos.
            Esto se puede lograr mediante el uso de interfaces o clases abstractas, permitiendo que un objeto de
            una clase derivada sea tratado como un objeto de su clase base.

            **Ejemplo
            Se puede tratar CuentaCorriente y CuentaAhorros como CuentaBancaria y utilizar un método común para
            realizar operaciones, independientemente del tipo específico de cuenta.

         */
    }
}
