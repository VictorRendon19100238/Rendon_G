# Java Thread Scheduler

El programador de subprocesos (*Thread Scheduler*) se encarga de ordenar la ejecución de los subprocesos (en base a su prioridad) en un entorno de subprocesos múltiples.

El scheduler identifica dos características de los hilos:

  + __La prioridad del hilo de ejecución:__ El rango de prioridades radica entre 1 y 10, la prioridad por defecto en un hilo en ejecución es un valor de 5 (asignado con *NORM_PRIORITY*); para asignar el mínimo valor se utiliza *MIN_PRIORITY*,  y para el valor máximo (10) es con *MAX_PRIORITY*. Con el método getPriority() se obtiene el valor actual de la prioridad de un hilo.
  
  + *El indicador de demonio (servicios):* Son hilos que se ejecutan con una prioridad baja, proporcionan un servicio básico a los programas cuando la actividad de la máquina es reducida; son útiles cuando un hilo debe ejecutarse en segundo plano durante largos períodos de tiempo.

Si solo existen hilos demonios ejecutándose, la JVM terminará. Los nuevos hilos heredan la prioridad y el indicador demonio de los hilos de ejecución que los han creado.

El scheduler sigue dos patrones:
  - __*El scheduler preemptivo:*__ Proporciona un segmento de tiempo a todos los hilos que están corriendo en el sistema.
  - __*El scheduler no preemptivo:*__ Decide qué hilo debe correr y lo ejecuta hasta que concluya.

#
### __Fuentes de información__
+ [Scheduling](https://sites.google.com/a/espe.edu.ec/programacion-ii/hilos/scheduling)
+ [Thread Scheduling In Java](https://www.w3spoint.com/thread-scheduling-in-java)
#

##### __Autor: *Víctor Manuel Rendón García*__ 
##### __No. de control: *19100238*__
##### __Carrera: *ISC*__
##### __Grupo: *03 A*__
##### __*Nuevo Laredo, Tamp., Octubre 24 de 2020*__
#