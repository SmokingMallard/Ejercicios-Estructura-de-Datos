/\*\*
\* Autor: Patricio Calvo Valdés
\* Fecha: /09/2025
\* Descripción: Actividad 3
\*\*/



Este programa en Java resuelve tres problemas clásicos usando recursividad y backtracking. Puedes elegir entre calcular un término de Fibonacci, verificar la suma de subconjuntos o resolver un Sudoku desde la consola.



\## Instrucciones de uso



1\. \*\*Ejecuta el programa.\*\*

2\. \*\*Selecciona una opción del menú escribiendo el número correspondiente y presionando Enter.\*\*

3\. \*\*Sigue las instrucciones específicas para cada opción.\*\*



---



\## Opción 1: Calcular término de Fibonacci



\*\*Descripción:\*\*  

Calcula el término n de la serie de Fibonacci usando recursividad.



\*\*Ejemplo de uso:\*\*

```

Seleccione una opción: 1

Ingrese el valor de n: 7

El término 7 de Fibonacci es: 13

```



---



\## Opción 2: Verificar suma de subconjuntos



\*\*Descripción:\*\*  

Verifica si existe un subconjunto de los números que sumen el valor objetivo.



\*\*Ejemplo de uso:\*\*

```

Seleccione una opción: 2

Escriba los números separados por espacio (ejemplo: 1 2 3 4):

3 34 4 12 5 2

¿Qué suma objetivo desea buscar?: 9

¡Sí existe un subconjunto que suma 9!

```

Si no existe:

```

No existe subconjunto que sume 100.

```



---



\## Opción 3: Resolver Sudoku



\*\*Descripción:\*\*  

Resuelve un Sudoku usando backtracking.  

Copia el tablero de ejemplo, reemplaza los `0` por los números de tu Sudoku y pégalo tal cual en la consola (incluyendo los símbolos y espacios).



\*\*Ejemplo de tablero para copiar y editar:\*\*

```

+-------+-------+-------+

| 5 3 0 | 0 7 0 | 0 0 0 |

| 6 0 0 | 1 9 5 | 0 0 0 |

| 0 9 8 | 0 0 0 | 0 6 0 |

+-------+-------+-------+

| 8 0 0 | 0 6 0 | 0 0 3 |

| 4 0 0 | 8 0 3 | 0 0 1 |

| 7 0 0 | 0 2 0 | 0 0 6 |

+-------+-------+-------+

| 0 6 0 | 0 0 0 | 2 8 0 |

| 0 0 0 | 4 1 9 | 0 0 5 |

| 0 0 0 | 0 8 0 | 0 7 9 |

+-------+-------+-------+

```



\*\*Pasos:\*\*

1\. Copia el tablero anterior.

2\. Reemplaza los `0` por los números conocidos de tu Sudoku.

3\. Pega el tablero completo en la consola, línea por línea.



\*\*Ejemplo de resultado:\*\*

```

Solución del Sudoku:

+-------+-------+-------+

| 5 3 4 | 6 7 8 | 9 1 2 |

| 6 7 2 | 1 9 5 | 3 4 8 |

| 1 9 8 | 3 4 2 | 5 6 7 |

+-------+-------+-------+

| 8 5 9 | 7 6 1 | 4 2 3 |

| 4 2 6 | 8 5 3 | 7 9 1 |

| 7 1 3 | 9 2 4 | 8 5 6 |

+-------+-------+-------+

| 9 6 1 | 5 3 7 | 2 8 4 |

| 2 8 7 | 4 1 9 | 6 3 5 |

| 3 4 5 | 2 8 6 | 1 7 9 |

+-------+-------+-------+

```



---



\## Opción 4: Salir



\*\*Descripción:\*\*  

Finaliza el programa.



---



\## Notas



\- Si ingresas una letra o símbolo donde se espera un número, el programa te pedirá que lo intentes de nuevo.

\- Para el Sudoku, asegúrate de pegar el tablero exactamente como se muestra, incluyendo los símbolos `|` y

