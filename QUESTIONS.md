# PARTE TEORICA

### Arquitecturas de UI: MVP, MVVM y MVI

#### MVVM

##### ¿En qué consiste esta arquitectura?
MVVM (Model-View-ViewModel) es un patrón de arquitectura cuyo principal objetivo es la separación de preocupaciones.
1.	**Las vistas (Views):**
*   Muestran la interfaz de usuario e informan sobre las acciones del usuario.

2.	**ViewModel:**
*	Obtiene la información de su modelo de datos
*	Aplica la operaciones necesarias y expone los datos relevantes a sus Vistas.
*	Expone eventos de backend a las vistas para que puedan reaccionar en consecuencia.

3.	**Model:**
*	El modelo, también conocido como DataModel, recupera información de su backend y lo pone a disposición de sus ViewModels.


##### ¿Cuáles son sus ventajas?
*	MVVM facilita la prueba unitaria de su código.
*	MVVM resuelve el problema del controlador de grasa proporcionando una mejor separación de preocupaciones.
*	MVVM combina las ventajas de MVP y MVC patrones de arquitectura con otras características útiles como DataBinding.
*   Mejora la capacidad de prueba de su código al proporcionar un mayor nivel de abstracción y reducir la cantidad de código de placa de caldera en sus proyectos.
*	Agregar ViewModels, cuyo propósito principal es estar completamente separado de las Vistas, reduce el riesgo de tener demasiado código en las otras capas.


##### ¿Qué inconvenientes tiene?
*	MVVM puede ser demasiado complejo para aplicaciones con una interfaz de usuario simple.

---

#### MVP

##### ¿En qué consiste esta arquitectura?
**MVP (Modelo-Vista-Presentador)**  es un patrón de arquitectura cuyo objetivo principal es la separación de preocupaciones y una mayor capacidad testeo.
 
A diferencia de MVC, en el que el punto de entrada principal es el controlador, en MVP el punto de entrada principal es la vista.
El **Modelo** es la capa de datos que maneja la lógica empresarial y La **Vista** muestra la interfaz de usuario e informa al presentador sobre las acciones del usuario, mientras que El Presentador hace de intermediario entre la Vista y el Modelo diciéndole al modelo que actualice los datos y a la vista que actualice la interfaz de usuario.
El **Presentador** no debe contener referencias a ninguna clase específica del marco de Android, como contexto, vista o intención. Esta regla le permite escribir regularmente Tests JUnit en el presentador.
Sin embargo el Presentador necesita comunicarse con la Vista de alguna manera haciendo referencia la Actividad, cosa que se soluciona creando interfaces para el presentador y la vista manteniendo las interfaces en una sola clase llamada clase de contrato.


##### ¿Cuáles son sus ventajas?
Sus ventajas es que separa las responsabilidades, y al no haber relación directa entre la Vista y el Modelo, el Presentador no se preocupa de a quien le da la información ni con quien está tratando, simplemente la maneja y la envía hacia un lado o hacia el otro sin importarle el destino. Esto facilita los Tests y descarga la responsabilidad de otras capas.

##### ¿Qué inconvenientes tiene?
Por otra parte, entre sus desventajas están que el desarrollador debe asegurarse de que no haya referencias al presentador en ninguna clase que continuará viviendo en la memoria cuando se destruye una actividad.

---

#### MVI

##### ¿En qué consiste esta arquitectura?
MVI son las siglas de Model-View-Intent. MVI es uno de los patrones de arquitectura más nuevos para Android. La arquitectura se inspiró en la naturaleza unidireccional y cíclica del marco Cycle.js y fue traída al mundo de Android por Hannes Dorfaman.
MVI funciona de forma muy diferente en comparación con sus parientes lejanos como MVC, MVP o MVVM. El papel de cada uno de sus componentes es el siguiente:
• **Modelo:** representa un estado. Los modelos en MVI deben ser inmutables para garantizar un flujo de datos unidireccional entre ellos y las otras capas de su arquitectura.
• **Intent (intención):** representa una intención o un deseo de realizar una acción por parte del usuario. Por cada acción del usuario, la Vista recibirá una intención, que será observada por el Presentador y traducida a un nuevo estado en sus Modelos.
• **View:** al igual que en MVP, están representados por interfaces, que luego se implementan en una o más actividades o fragmentos.


##### ¿Cuáles son sus ventajas?
Las principales ventajas de MVI son:
• Un flujo de datos unidireccional y cíclico para su aplicación.
• Estado coherente durante todo el ciclo de vida de sus vistas.
• Modelos inmutables que proporcionan un comportamiento confiable y seguridad de subprocesos en aplicaciones grandes.

##### ¿Qué inconvenientes tiene?
Probablemente, el único inconveniente de usar MVI en lugar de otros patrones de arquitectura para Android es que la curva de aprendizaje para este patrón tiende a ser un poco más alta, ya que necesita tener una cantidad decente de conocimiento de otros temas intermedios/avanzados como como programación reactiva, multi-threading y RxJava. Por lo tanto, otros patrones de arquitectura como MVC o MVP podrían ser más fáciles de comprender para los desarrolladores principiantes de Android.

---

### Testing

#### ¿Qué tipo de tests se deberían incluir en cada parte de la pirámide de test? Pon ejemplos de librerías de testing para cada una de las partes. 
JUnit y Mockito small tests (unitarias)
Pruebas de integración con Roboelectric.  médium tests
Las pruebas grandes son pruebas de integración e IU que emulan el comportamiento del usuario y afirman los resultados de la IU.  Espresso y UI Automator.
Google recomienda que cree pruebas de cada categoría en función de los casos de uso de su aplicación de acuerdo con la siguiente regla: 70 por ciento pequeña, 20 por ciento mediana y 10 por ciento grande.

#### ¿Por qué los desarrolladores deben centrarse sobre todo en los Unido Tests?
Porque son más faciles de programar y ligeras en cuanto a consumo de recursos.

---

### Inyección de dependencias

#### Explica en qué consiste y por qué nos ayuda a mejorar nuestro código.
Una dependencia se produce cuando una clase requiere de otra para su correcto funcionamiento.
Nos ayuda a mejorar nuestro código ya que permite la reutilización de éste y por consiguiente evitar la redundancia de código.

#### Explica cómo se hace para aplicar inyección de dependencias de forma manual a un proyecto (sin utilizar librerías externas).
En lugar de que una clase cree sus propias dependencias, debe crear esas dependencias en el exterior y pasarlas a la clase a través de su constructor.
La inyección de dependencia es un patrón en el que las dependencias se pasan a una clase desde una entidad externa.
Permite una mayor reutilización de esa clase y es especialmente importante para las pruebas unitarias de una clase, ya que pasar dependencias a través del constructor de una clase permite que los objetos simulados se pasen a esa clase durante las pruebas unitarias.
