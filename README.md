## Juego de ahorcado en JAVA (hangman game)

Juego de ahorcado en donde el usuario debe ingresar letras por consola para adivinar la palabra y tiene cierta cantidad de intentos.
Si logra completar toda la palabra, recibe un mensaje de felicitación mostrándole la palabra a adivinar. Si agota los intentos, pierde.

## ¿Qué herramientas utilizamos?

1. Clase Scanner
2. Declaraciones y asignaciones
3. Arreglos
4. Estructuras de control condicionales: IF/ELSE
5. Estrcuturas de control repetitivas: WHILE y FOR
6. Clase String y sus Métodos valueOf, charAt y length()
7. Clase Character y su método toLowerCase

## Ejemplo de ejecución:
### Happy path utilizando la palabra INTELIGENCIA

Palabra a adivinar: ____________ (12 letras)

Intentos restantes: 10

Introduce una letra por favor:

a

Palabra a adivinar: ___________a (12 letras)

Intentos restantes: 10

Introduce una letra por favor:

e

Palabra a adivinar: ___e___e___a (12 letras)

Intentos restantes: 10

Introduce una letra por favor:

...

Palabra a adivinar: inteligen_ia (12 letras)

Intentos restantes: 10

Introduce una letra por favor:

c

¡Felicidades! Has adivinado la palabra: inteligencia


